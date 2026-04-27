package com.example.medicoreCommonLib.dto.medicalRecord;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MedicalRecordRequestDto {
    private String symptoms;
    private String physicalExamination;
    private String diagnosis;
    private String recommendations;
    private Long visitId;

}
