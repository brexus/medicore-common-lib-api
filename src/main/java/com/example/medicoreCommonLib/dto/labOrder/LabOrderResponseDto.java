package com.example.medicoreCommonLib.dto.labOrder;

import com.example.medicoreCommonLib.dto.BaseDto;
import com.example.medicoreCommonLib.dto.visit.VisitResponseDto;
import com.example.medicoreCommonLib.enums.LabOrderStatusEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class LabOrderResponseDto extends BaseDto {
    private VisitResponseDto visit;
    private String testName;
    private LabOrderStatusEnum status;
    private String accessCode;
    private String resultPdfUrl;

}
