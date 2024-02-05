package com.hyperface.oms.service.impl;

import com.hyperface.oms.dto.Transaction;
import com.hyperface.oms.repository.impl.RocksDBRepositoryImpl;
import com.hyperface.oms.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class TransactionServiceImpl implements TransactionService {

  @Autowired
  @Qualifier(value = "transactionsRocksDBRepository")
  private RocksDBRepositoryImpl<Transaction> transactionsRocksDBRepository;

  @Override
  public void createTransaction(Transaction transaction) {
    transactionsRocksDBRepository.save(transaction);
  }
}
