package com.hyperface.oms.dto.benefit;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.hyperface.oms.dto.benefit.type.FixedAmountBenefit;
import com.hyperface.oms.dto.benefit.type.FixedPercentageBenefit;
import com.hyperface.oms.dto.benefit.type.FixedPercentageWithMaxLimitBenefit;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true)
@EqualsAndHashCode(callSuper = false)
@JsonSubTypes({
  @JsonSubTypes.Type(value = FixedAmountBenefit.class, name = "FIXED_AMOUNT"),
  @JsonSubTypes.Type(value = FixedPercentageBenefit.class, name = "FIXED_PERCENTAGE"),
  @JsonSubTypes.Type(
      value = FixedPercentageWithMaxLimitBenefit.class,
      name = "FIXED_PERCENTAGE_WITH_MAX_LIMIT")
})
public abstract class BenefitMetadata {
  private String id;
}
