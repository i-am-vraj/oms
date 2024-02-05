package com.hyperface.oms.controller;

import com.hyperface.oms.dto.Transaction;
import com.hyperface.oms.service.TransactionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(path = "/v1.0/transaction")
public class TransactionController {

  @Autowired private TransactionService transactionService;

  @PostMapping
  public ResponseEntity<Boolean> createTransaction(@RequestBody Transaction transaction) {
    transactionService.createTransaction(transaction);
    return new ResponseEntity<>(true, HttpStatus.OK);
  }
}
