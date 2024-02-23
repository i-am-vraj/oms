package com.learn.oms.repository.impl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.learn.oms.repository.RocksDBRepository;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.rocksdb.RocksDB;
import org.rocksdb.RocksDBException;
import org.rocksdb.RocksIterator;
import org.rocksdb.WriteOptions;
import org.springframework.util.SerializationUtils;

@Slf4j
public class RocksDBRepositoryImpl<V> implements RocksDBRepository<UUID, V> {

  private final RocksDB rocksDB;
  private final ObjectWriter objectWriter;
  private final ObjectReader objectReader;

  public RocksDBRepositoryImpl(
      RocksDB rocksDB, ObjectWriter objectWriter, ObjectReader objectReader) {
    this.rocksDB = rocksDB;
    this.objectWriter = objectWriter;
    this.objectReader = objectReader;
  }

  private final WriteOptions writeOptions = new WriteOptions();

  @Override
  public void save(V value) {
    try {
      byte[] valueAsBytes = objectWriter.writeValueAsBytes(value);
      rocksDB.put(SerializationUtils.serialize(UUID.randomUUID()), valueAsBytes);
    } catch (RocksDBException | JsonProcessingException e) {
      log.error("got an error while saving the entry for value: {} with exception: ", value, e);
    }
  }

  @Override
  public Map<UUID, V> findAll() {
    Map<UUID, V> values = new HashMap<>();
    try (RocksIterator iterator = rocksDB.newIterator()) {
      iterator.seekToFirst();
      while (iterator.isValid()) {
        UUID key = UUID.fromString(String.valueOf(SerializationUtils.deserialize(iterator.key())));
        V value = objectReader.readValue(iterator.value());
        values.put(key, value);
        iterator.next();
      }
    } catch (IOException e) {
      log.warn("got an error while getting all entries with exception: ", e);
      return new HashMap<>();
    }
    return values;
  }
}
