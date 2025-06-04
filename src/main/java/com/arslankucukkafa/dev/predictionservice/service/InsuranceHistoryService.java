package com.arslankucukkafa.dev.predictionservice.service;

import com.arslankucukkafa.dev.predictionservice.entity.InsuranceHistory;
import com.arslankucukkafa.dev.predictionservice.repository.InsuranceHistoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InsuranceHistoryService {

    private final InsuranceHistoryRepository insuranceHistoryRepository;

    public InsuranceHistoryService(InsuranceHistoryRepository insuranceHistoryRepository) {
        this.insuranceHistoryRepository = insuranceHistoryRepository;
    }

    public InsuranceHistory getInsuranceHistoryById(Long id) {
        return insuranceHistoryRepository.findById(id)
                .orElse(null);
    }

    public List<InsuranceHistory> getAllInsuranceHistories() {
        return insuranceHistoryRepository.findAll();
    }

}
