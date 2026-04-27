package com.example.medicoreCommonLib.dto.visit;

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
public class VisitShortSummaryDto {
    private Long id;
    private LocalDateTime visitDate;
    private String doctorFullName;
    private VisitStatusEnum status;
}
