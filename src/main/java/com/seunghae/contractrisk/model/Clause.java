package com.seunghae.contractrisk.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 계약 조항 정보를 나타내는 데이터 클래스
 * Data class representing a single clause of a contract.
 *
 * 각 조항은 순번과 텍스트 내용으로 구성됨
 * Each clause includes a clause number and the text.
 * 계약서의 세부 조항 분석을 위한 기본 단위 모델
 * Basic unit model for clause-level analysis in contracts.
 *
 * @author Seunghae Cheon (@seunghae-dev)
 * @version 1.0
 */

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Clause {

    /** 조항 순번 / Clause number */
    private int number;

    /** 조항 내용 / Clause text */
    private String text;
}
