package com.arslankucukkafa.dev.predictionservice;

import com.arslankucukkafa.dev.predictionservice.entity.InsuranceClaim;
import com.arslankucukkafa.dev.predictionservice.entity.InsuranceHistory;
import com.arslankucukkafa.dev.predictionservice.entity.InsurancePolicy;
import com.arslankucukkafa.dev.predictionservice.entity.InsurancePolicyStatus;
import com.arslankucukkafa.dev.predictionservice.repository.InsuranceHistoryRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class PredictionServiceApplication {
    private final InsuranceHistoryRepository insuranceHistoryRepository;

    public PredictionServiceApplication(InsuranceHistoryRepository insuranceHistoryRepository) {
        this.insuranceHistoryRepository = insuranceHistoryRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(PredictionServiceApplication.class, args);
    }

    @PostConstruct
    public void sampleInsuranceData() {
        InsurancePolicy insurancePolicy1 = new InsurancePolicy();
        insurancePolicy1.setPolicyType("Health Insurance");
        insurancePolicy1.setCoverageAmount(100000.0);
        insurancePolicy1.setPremiumAmount(200000.0);
        insurancePolicy1.setValidFrom(LocalDateTime.now());
        insurancePolicy1.setValidUntil(LocalDateTime.now().plusYears(1));
        insurancePolicy1.setCreatedAt(LocalDateTime.now());
        insurancePolicy1.setUser("123456789");

        InsuranceClaim insuranceClaim1 = new InsuranceClaim();
        insuranceClaim1.setCreatedAt(LocalDateTime.now());
        insuranceClaim1.setUpdatedAt(LocalDateTime.now().plusHours(5));
        insuranceClaim1.setClaimAmount(5000.0);
        insuranceClaim1.setClaimStatus(InsurancePolicyStatus.APPROVED);
        insuranceClaim1.setDateOfClaim(LocalDateTime.now().minusDays(10));

        InsuranceHistory insuranceHistory1 = new InsuranceHistory();
        insuranceHistory1.setCreatedAt(LocalDateTime.now());
        insuranceHistory1.setUpdatedAt(LocalDateTime.now().plusHours(20));
        insuranceHistory1.setUser("123456789");

        insuranceHistory1.setInsurancePolicy(insurancePolicy1);
        insuranceHistory1.setInsuranceClaims(List.of(insuranceClaim1));
        insuranceHistoryRepository.save(insuranceHistory1);
    }
}
