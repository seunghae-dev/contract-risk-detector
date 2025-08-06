package com.seunghae.contractrisk.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

/**
 * 계약 정보를 나타내는 엔터티 클래스
 * Entity class representing contract information.
 *
 * 제목, 전체 텍스트, 조항 목록으로 구성된 계약 모델
 * A contract consists of a title, full text, and a list of clauses.
 * 계약 리스크 분석 시스템의 핵심 데이터 모델
 * Core data model in the contract risk analysis system.
 *
 * @author Seunghae Cheon (@seunghae-dev)
 * @version 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = {"content", "clauses"})
public class Contract {

    /** 계약 ID / Contract ID */
    private String id;

    /** 계약 제목 / Contract title */
    private String title;

    /** 계약 전체 내용 / Full contract content */
    private String content;

    /** 계약 조항 목록 / List of clauses */
    private List<Clause> clauses;

    public List<Risk> analyzeRisks(List<String> keywords) {
        List<Risk> risks = new ArrayList<>();
        if (clauses == null || keywords == null) return risks;

        for (Clause clause : clauses) {
            for (String keyword : keywords) {
                if (clause.getText().toLowerCase().contains(keyword.toLowerCase())) {
                    risks.add(new Risk(
                            clause.getText(),
                            "KeywordMatch",
                            "Detected keyword: " + keyword
                    ));
                    break;
                }
            }
        }
        return risks;
    }
}
