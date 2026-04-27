package com.example.medicoreCommonLib.dto.medicalRecord;

import com.example.medicoreCommonLib.dto.BaseDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecordResponseDto extends BaseDto {
    private String symptoms;
    private String physicalExamination;
    private String diagnosis;
    private String recommendations;
}
