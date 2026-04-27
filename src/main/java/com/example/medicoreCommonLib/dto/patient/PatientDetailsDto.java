package com.example.medicoreCommonLib.dto.patient;

import com.example.medicoreCommonLib.dto.visit.VisitShortSummaryDto;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Data
@SuperBuilder
public class PatientDetailsDto {
    private PatientResponseDto patient;
    private List<VisitShortSummaryDto> visits;
}
