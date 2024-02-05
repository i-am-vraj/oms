package com.hyperface.oms.dto.eligibility.type;

import com.hyperface.oms.dto.eligibility.Condition;
import com.hyperface.oms.dto.eligibility.EligibilityMetadata;
import java.util.List;
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
public class FieldBasedEligibility extends EligibilityMetadata {
  private List<Condition> conditions;
}
