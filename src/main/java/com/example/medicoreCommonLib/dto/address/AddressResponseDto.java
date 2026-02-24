package com.example.medicoreCommonLib.dto.address;

import com.example.medicoreCommonLib.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class AddressResponseDto extends BaseDto {
    private String street;
    private String buildingNumber;
    private String apartmentNumber;
    private String city;
    private String zipCode;
    private String country;
}
