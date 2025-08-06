package com.seunghae.contractrisk.controller;

import com.seunghae.contractrisk.dto.AnalyzeRequest;
import com.seunghae.contractrisk.model.Clause;
import com.seunghae.contractrisk.model.Contract;
import com.seunghae.contractrisk.model.Risk;
import com.seunghae.contractrisk.service.ContractService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

/**
 * 계약 리스크 분석 요청을 처리하는 REST 컨트롤러
 * REST controller that handles contract risk analysis requests.
 *
 * /api/analyze 경로로 계약 리스크 분석 기능 제공
 * Provides contract risk detection at /api/analyze endpoint.
 *
 * @author Seunghae Cheon (@seunghae-dev)
 * @version 1.0
 */


@RestController
@RequestMapping("/api")
public class ContractController {

    private final ContractService contractService;

    public ContractController(ContractService contractService) {
        this.contractService = contractService;
    }

    /**
     * 계약 정보를 받아 키워드 기반으로 리스크를 분석하는 API
     * Analyzes contract risk based on predefined keywords.
     *
     * @return 리스크 목록 응답 / Response containing list of risks
     */
    @GetMapping("/analyze")
    public ResponseEntity<List<Risk>> analyzeContract() {
        // 샘플 데이터 생성
        Contract contract = new Contract();
        contract.setId("001");
        contract.setTitle("샘플 계약서 / Sample Contract");
        contract.setContent("본 계약은 손해배상 및 계약 해지 조항을 포함합니다.");
        contract.setClauses(Arrays.asList(
                new Clause(1, "계약 해지 사유는 다음과 같습니다."),
                new Clause(2, "손해배상 책임은 당사자에게 있습니다."),
                new Clause(3, "지급 조건은 매월 1일입니다.")
        ));

        List<String> keywords = Arrays.asList("손해배상", "해지", "위약금");

        List<Risk> risks = contractService.detectRisks(contract, keywords);
        return ResponseEntity.ok(risks);
    }

    @PostMapping("/analyze")
    public ResponseEntity<List<Risk>> analyzeContractFromRequest(@RequestBody AnalyzeRequest request) {
        Contract contract = new Contract();
        contract.setClauses(request.getClauses());
        List<Risk> risks = contractService.detectRisks(contract, request.getKeywords());
        return ResponseEntity.ok(risks);
    }
}