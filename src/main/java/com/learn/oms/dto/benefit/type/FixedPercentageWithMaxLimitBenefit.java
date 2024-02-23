package com.learn.oms.dto.benefit.type;

import com.learn.oms.dto.benefit.BenefitMetadata;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(doNotUseGetters = true)
@EqualsAndHashCode(callSuper = false)
public class FixedPercentageWithMaxLimitBenefit extends BenefitMetadata {
  private double percentage;
  private double maxLimit;
}
