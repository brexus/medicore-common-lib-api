package com.example.medicoreCommonLib.dto.patient;

import com.example.medicoreCommonLib.dto.BaseDto;
import com.example.medicoreCommonLib.dto.address.AddressResponseDto;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class PatientResponseDto extends BaseDto {
    private String firstName;
    private String lastName;
    private String pesel;
    private String dateOfBirth;
    private String email;
    private String phoneNumber;
    private String gender;
    private AddressResponseDto address;
}
