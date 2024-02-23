package com.learn.oms.dto;

import java.sql.Timestamp;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {
  private Long id;
  private Long customerId;
  private Long merchantId;
  private Timestamp timestamp;
  private String city;
  private double amount;
}
