package com.hyperface.oms.dto.eligibility;

import lombok.Getter;

@Getter
public enum Operator {
  GREATER_THAN(">"),
  GREATER_THAN_OR_EQUAL(">="),
  LESS_THAN("<"),
  LESS_THAN_OR_EQUAL("<=");

  private final String op;

  Operator(String op) {
    this.op = op;
  }
}
