package com.learn.oms.service.eligibility.factory;

import com.learn.oms.dto.eligibility.Eligibility;
import com.learn.oms.service.eligibility.EligibilityValidator;
import jakarta.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class EligibilityValidatorFactory {

  @Autowired private List<EligibilityValidator> eligibilityValidators;

  private static Map<Eligibility, EligibilityValidator> map = new HashMap<>();

  @PostConstruct
  public void register() {
    map =
        eligibilityValidators.stream()
            .collect(
                Collectors.toMap(EligibilityValidator::getEligibilityType, Function.identity()));
  }

  public EligibilityValidator getEligibilityValidator(Eligibility eligibility) {
    if (!map.containsKey(eligibility)) {
      log.error("no validator registered for eligibility: {}", eligibility);
    }
    return map.get(eligibility);
  }
}
