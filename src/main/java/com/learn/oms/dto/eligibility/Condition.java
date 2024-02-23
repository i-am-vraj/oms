package com.learn.oms.dto.eligibility;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Condition {
  private String field;
  private Operator operator;
  private double value;
}
