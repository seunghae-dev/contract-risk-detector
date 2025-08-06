package com.seunghae.contractrisk.model;

import lombok.*;

/**
 * 리스크 분석 결과를 담는 데이터 클래스
 * Data class representing risk detection result.
 *
 * 조항에 포함된 위험 유형과 설명을 포함
 * Contains the type of detected risk and explanation.
 * 계약 리스크 평가 결과를 구성하는 핵심 분석 데이터
 * Core output model for contract risk evaluation.
 *
 * @author Seunghae Cheon (@seunghae-dev)
 * @version 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "clauseText")
public class Risk {

    /** 리스크가 감지된 조항 텍스트 / Detected clause text */
    private String clauseText;

    /** 리스크 유형 / Type of risk */
    private String riskType;

    /** 리스크 설명 / Risk explanation */
    private String explanation;
}
