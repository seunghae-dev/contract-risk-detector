package com.seunghae.contractrisk.service;

import com.seunghae.contractrisk.model.Risk;
import com.seunghae.contractrisk.model.Contract;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 계약 리스크 분석 서비스 클래스
 * Service class for analyzing contract risk based on clause content.
 *
 * 키워드 기반으로 계약 내용을 분석하고 리스크 목록을 반환
 * Analyzes contract clauses based on keywords and returns list of risks.
 *
 * @author Seunghae Cheon (@seunghae-dev)
 * @version 1.0
 */

@Service
public class ContractService {

    /**
     * 계약서에 포함된 리스크를 키워드 기반으로 분석
     * Analyze risks from a given contract using keyword matching.
     *
     * @param contract 분석 대상 계약 / Contract to analyze
     * @param keywords 리스크 키워드 목록 / List of risk keywords
     * @return 분석된 리스크 리스트 / List of detected risks
     */
    public List<Risk> detectRisks(Contract contract, List<String> keywords) {
        return contract.analyzeRisks(keywords);
    }
}
