package com.learn.oms.dto;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.learn.oms.dto.benefit.Benefit;
import com.learn.oms.dto.benefit.BenefitMetadata;
import com.learn.oms.dto.eligibility.Eligibility;
import com.learn.oms.dto.eligibility.EligibilityMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true)
public class Offer {
  private Long id;
  private Eligibility eligibility;
  private Benefit benefit;

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.NAME,
      include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
      property = "eligibility")
  private EligibilityMetadata eligibilityMetadata;

  @JsonTypeInfo(
      use = JsonTypeInfo.Id.NAME,
      include = JsonTypeInfo.As.EXTERNAL_PROPERTY,
      property = "benefit")
  private BenefitMetadata benefitMetadata;
}
