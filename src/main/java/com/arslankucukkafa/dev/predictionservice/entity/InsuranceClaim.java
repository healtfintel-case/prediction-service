package com.arslankucukkafa.dev.predictionservice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
/**
 * Sigorta talebi*/
@Entity
@Table(name = "insurance_claims")
public class InsuranceClaim extends BaseEntity {

    private Double claimAmount;
    private InsurancePolicyStatus claimStatus; // Onaylı, Reddiye, İnceleniyor
    private LocalDateTime dateOfClaim;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "insurance_history_id")
    private InsuranceHistory insuranceHistory;

    public Double getClaimAmount() {
        return claimAmount;
    }

    public void setClaimAmount(Double claimAmount) {
        this.claimAmount = claimAmount;
    }

    public InsurancePolicyStatus getClaimStatus() {
        return claimStatus;
    }

    public void setClaimStatus(InsurancePolicyStatus claimStatus) {
        this.claimStatus = claimStatus;
    }

    public LocalDateTime getDateOfClaim() {
        return dateOfClaim;
    }

    public void setDateOfClaim(LocalDateTime dateOfClaim) {
        this.dateOfClaim = dateOfClaim;
    }

    public InsuranceHistory getInsuranceHistory() {
        return insuranceHistory;
    }

    public void setInsuranceHistory(InsuranceHistory insuranceHistory) {
        this.insuranceHistory = insuranceHistory;
    }
}
