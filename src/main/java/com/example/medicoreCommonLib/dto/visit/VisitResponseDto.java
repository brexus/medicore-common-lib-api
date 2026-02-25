package com.example.medicoreCommonLib.dto.visit;

import com.example.medicoreCommonLib.dto.BaseDto;
import com.example.medicoreCommonLib.dto.doctor.DoctorResponseDto;
import com.example.medicoreCommonLib.dto.patient.PatientResponseDto;
import com.example.medicoreCommonLib.enums.VisitStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDateTime;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class VisitResponseDto extends BaseDto {
    private PatientResponseDto patient;
    private DoctorResponseDto doctor;
    private LocalDateTime visitDate;
    private VisitStatusEnum status;

}
