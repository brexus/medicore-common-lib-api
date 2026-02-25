package com.example.medicoreCommonLib.dto.doctor;

import com.example.medicoreCommonLib.dto.BaseDto;
import com.example.medicoreCommonLib.dto.address.AddressResponseDto;
import com.example.medicoreCommonLib.enums.GenderEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class DoctorResponseDto extends BaseDto {
    private AddressResponseDto address;
    private String firstName;
    private String lastName;
    private String licenseNumber;
    private String specialization;
    private String phoneNumber;
    private String email;
    private GenderEnum gender;
}
