package com.hyperface.oms.service.eligibility;

import com.hyperface.oms.dto.EligibilityResult;
import com.hyperface.oms.dto.EligibilitySource;
import com.hyperface.oms.dto.eligibility.Eligibility;
import com.hyperface.oms.dto.eligibility.EligibilityMetadata;

public interface EligibilityValidator {

  EligibilityResult validate(
      EligibilityMetadata eligibilityMetadata, EligibilitySource eligibilitySource);

  Eligibility getEligibilityType();
}
