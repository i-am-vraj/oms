package com.learn.oms.dto.eligibility;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.learn.oms.dto.eligibility.type.FieldBasedEligibility;
import com.learn.oms.dto.eligibility.type.MilestoneBasedEligibility;
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
  @JsonSubTypes.Type(value = FieldBasedEligibility.class, name = "FIELD"),
  @JsonSubTypes.Type(value = MilestoneBasedEligibility.class, name = "MILESTONE")
})
public abstract class EligibilityMetadata {

  private Class entity;
}
