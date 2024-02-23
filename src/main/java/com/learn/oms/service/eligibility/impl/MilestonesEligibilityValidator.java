package com.learn.oms.service.eligibility.impl;

import com.learn.oms.dto.EligibilityResult;
import com.learn.oms.dto.EligibilitySource;
import com.learn.oms.dto.eligibility.Eligibility;
import com.learn.oms.dto.eligibility.EligibilityMetadata;
import com.learn.oms.dto.eligibility.type.MilestoneBasedEligibility;
import com.learn.oms.service.eligibility.EligibilityValidator;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MilestonesEligibilityValidator implements EligibilityValidator {

  @Override
  public EligibilityResult validate(
      EligibilityMetadata eligibilityMetadata, EligibilitySource eligibilitySource) {
    MilestoneBasedEligibility metadata = (MilestoneBasedEligibility) eligibilityMetadata;

    // TODO
    // need to implement this entire logic
    return EligibilityResult.builder().eligible(false).build();
  }

  @Override
  public Eligibility getEligibilityType() {
    return Eligibility.MILESTONE;
  }
}
