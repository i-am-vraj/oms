package com.learn.oms.service.eligibility;

import com.learn.oms.dto.EligibilityResult;
import com.learn.oms.dto.EligibilitySource;
import com.learn.oms.dto.eligibility.Eligibility;
import com.learn.oms.dto.eligibility.EligibilityMetadata;

public interface EligibilityValidator {

  EligibilityResult validate(
      EligibilityMetadata eligibilityMetadata, EligibilitySource eligibilitySource);

  Eligibility getEligibilityType();
}
