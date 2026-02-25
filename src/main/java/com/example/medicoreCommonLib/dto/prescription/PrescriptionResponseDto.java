package com.example.medicoreCommonLib.dto.prescription;

import com.example.medicoreCommonLib.dto.BaseDto;
import com.example.medicoreCommonLib.dto.visit.VisitResponseDto;
import com.example.medicoreCommonLib.enums.PrescriptionStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PrescriptionResponseDto extends BaseDto {
    private VisitResponseDto visit;
    private String medicationName;
    private String dosage;
    private Integer durationDays;
    private Integer quantity;
    private PrescriptionStatusEnum status;
    private String accessCode;
}
