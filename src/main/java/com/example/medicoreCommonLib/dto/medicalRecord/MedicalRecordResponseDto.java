package com.example.medicoreCommonLib.dto.medicalRecord;

import com.example.medicoreCommonLib.dto.BaseDto;
import com.example.medicoreCommonLib.dto.visit.VisitResponseDto;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecordResponseDto extends BaseDto {
    private VisitResponseDto visit;
    private String symptoms;
    private String physicalExamination;
    private String diagnosis;
    private String recommendations;
}
