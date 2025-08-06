package com.seunghae.contractrisk.dto;

import com.seunghae.contractrisk.model.Clause;
import lombok.*;

import java.util.List;

/**
 * 계약 분석 요청을 위한 DTO 클래스
 * DTO class for contract risk analysis request.
 *
 * 조항 리스트와 키워드 리스트를 포함
 * Includes list of clauses and list of keywords.
 *
 * @author Seunghae Cheon (@seunghae-dev)
 * @version 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class AnalyzeRequest {
    private List<Clause> clauses;
    private List<String> keywords;
}
