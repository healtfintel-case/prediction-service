package com.arslankucukkafa.dev.predictionservice.controller;

import com.arslankucukkafa.dev.predictionservice.entity.InsuranceHistory;
import com.arslankucukkafa.dev.predictionservice.service.InsuranceHistoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/insurance-history")
public class InsuranceHistoryController {

    private final InsuranceHistoryService insuranceHistoryService;

    public InsuranceHistoryController(InsuranceHistoryService insuranceHistoryService) {
        this.insuranceHistoryService = insuranceHistoryService;
    }

    @GetMapping
    public ResponseEntity<InsuranceHistory> getInsuranceHistory() {
        return new ResponseEntity<>(insuranceHistoryService.getInsuranceHistoryById(1L), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllInsuranceHistories() {
        return new ResponseEntity<>(insuranceHistoryService.getAllInsuranceHistories(), HttpStatus.OK);
    }
}
