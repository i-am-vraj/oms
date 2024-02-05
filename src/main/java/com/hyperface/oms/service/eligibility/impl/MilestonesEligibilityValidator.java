package com.hyperface.oms.service.eligibility.impl;

import com.hyperface.oms.dto.EligibilityResult;
import com.hyperface.oms.dto.EligibilitySource;
import com.hyperface.oms.dto.eligibility.Eligibility;
import com.hyperface.oms.dto.eligibility.EligibilityMetadata;
import com.hyperface.oms.dto.eligibility.type.MilestoneBasedEligibility;
import com.hyperface.oms.service.eligibility.EligibilityValidator;
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
