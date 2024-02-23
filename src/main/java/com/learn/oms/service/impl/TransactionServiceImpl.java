package com.learn.oms.service.impl;

import com.learn.oms.dto.Customer;
import com.learn.oms.dto.EligibilitySource;
import com.learn.oms.dto.Transaction;
import com.learn.oms.repository.impl.RocksDBRepositoryImpl;
import com.learn.oms.service.OfferService;
import com.learn.oms.service.TransactionService;
import com.learn.oms.service.eligibility.factory.EligibilityValidatorFactory;
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

  @Autowired private OfferService offerService;

  @Autowired private EligibilityValidatorFactory eligibilityValidatorFactory;

  @Override
  public void createTransaction(Transaction transaction) {
    transactionsRocksDBRepository.save(transaction);

    EligibilitySource eligibilitySource =
        EligibilitySource.builder()
            .customer(Customer.builder().age(25).build())
            .transaction(transaction)
            .build();

    offerService
        .getOffers()
        .forEach(
            offer -> {
              eligibilityValidatorFactory
                  .getEligibilityValidator(offer.getEligibility())
                  .validate(offer.getEligibilityMetadata(), eligibilitySource);
            });
  }
}
