package com.hyperface.oms.dto;

import com.hyperface.oms.dto.enums.Gender;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
  private Long id;
  private int age;
  private Date dateOfBirth;
  private Gender gender;
}
