package com.learn.oms.config;

import com.learn.oms.dto.Offer;
import com.learn.oms.dto.Transaction;
import com.learn.oms.repository.impl.RocksDBRepositoryImpl;
import com.learn.oms.utils.Utils;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import lombok.extern.slf4j.Slf4j;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Configuration
public class RocksDBConfiguration {

  private static final String ROCKSDB_DIRECTORY = "/opt/learn/rocksdb/";

  private static final String OFFERS_FILE_NAME = "offers-db";
  private static final String TRANSACTIONS_FILE_NAME = "transactions-db";

  public RocksDB createOrOpenRocksDB(String dir, String filename) {
    RocksDB.loadLibrary();
    File fileDB = new File(dir, filename);
    try {
      Files.createDirectories(fileDB.getParentFile().toPath());
      Files.createDirectories(fileDB.getAbsoluteFile().toPath());
      RocksDB db = RocksDB.open(fileDB.getAbsolutePath());
      log.info("RocksDB initialized with dir: {}", fileDB);
      return db;
    } catch (IOException | RocksDBException e) {
      log.error("error initializing RocksDB with exception for dir: {}", fileDB, e);
      throw new RuntimeException();
    }
  }

  @Bean(name = "offersRocksDBRepository")
  public RocksDBRepositoryImpl<Offer> registerOffersRepository() {
    return new RocksDBRepositoryImpl<>(
        createOrOpenRocksDB(ROCKSDB_DIRECTORY, OFFERS_FILE_NAME),
        Utils.offerWriter,
        Utils.offerReader);
  }

  @Bean(name = "transactionsRocksDBRepository")
  public RocksDBRepositoryImpl<Transaction> registerTransactionsRepository() {
    return new RocksDBRepositoryImpl<>(
        createOrOpenRocksDB(ROCKSDB_DIRECTORY, TRANSACTIONS_FILE_NAME),
        Utils.transactionWriter,
        Utils.transactionReader);
  }
}
