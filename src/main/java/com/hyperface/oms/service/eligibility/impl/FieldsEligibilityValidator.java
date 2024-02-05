package com.hyperface.oms.service.eligibility.impl;

import com.hyperface.oms.dto.Customer;
import com.hyperface.oms.dto.EligibilityResult;
import com.hyperface.oms.dto.EligibilitySource;
import com.hyperface.oms.dto.Transaction;
import com.hyperface.oms.dto.eligibility.Condition;
import com.hyperface.oms.dto.eligibility.Eligibility;
import com.hyperface.oms.dto.eligibility.EligibilityMetadata;
import com.hyperface.oms.dto.eligibility.type.FieldBasedEligibility;
import com.hyperface.oms.service.eligibility.EligibilityValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class FieldsEligibilityValidator implements EligibilityValidator {

  @Override
  public EligibilityResult validate(
      EligibilityMetadata eligibilityMetadata, EligibilitySource eligibilitySource) {
    FieldBasedEligibility metadata = (FieldBasedEligibility) eligibilityMetadata;

    boolean eligible = true;
    if (Customer.class.equals(metadata.getEntity())) {

      Customer customer = eligibilitySource.getCustomer();

      for (Condition condition : metadata.getConditions()) {

        if (condition.getField().equals("age")) {
          switch (condition.getOperator()) {
            case LESS_THAN -> {
              if (customer.getAge() > condition.getValue()) {
                eligible = false;
              }
            }

            case GREATER_THAN -> {
              if (customer.getAge() < condition.getValue()) {
                eligible = false;
              }
            }

              // TODO
              // follow the logic
              // better way to do this?
          }
        }

        if (!eligible) {
          break;
        }
      }

    } else if (Transaction.class.equals(metadata.getEntity())) {
      // TODO
      // same logic as above --> move to interface
      // AOP can be used to make it generic
      eligible = false;
    }

    if (eligible) {
      return EligibilityResult.builder().eligible(true).totalAmount(100).build();
    } else {
      return EligibilityResult.builder().eligible(false).build();
    }
  }

  @Override
  public Eligibility getEligibilityType() {
    return Eligibility.FIELD;
  }
}
