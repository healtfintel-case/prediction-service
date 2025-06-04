package com.arslankucukkafa.dev.predictionservice.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

/**
 * Sigorta poliçesi
 */
@Table(name = "insurance_policies")
@Entity
public class InsurancePolicy extends BaseEntity {

    private String policyType;
    private Double coverageAmount;
    private Double premiumAmount;
    private LocalDateTime validFrom;
    private LocalDateTime validUntil;
    @Column(name = "user_id")
    private String user;

    public Double getCoverageAmount() {
        return coverageAmount;
    }

    public void setCoverageAmount(Double coverageAmount) {
        this.coverageAmount = coverageAmount;
    }

    public String getPolicyType() {
        return policyType;
    }

    public void setPolicyType(String policyType) {
        this.policyType = policyType;
    }

    public Double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(Double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public LocalDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(LocalDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public LocalDateTime getValidUntil() {
        return validUntil;
    }

    public void setValidUntil(LocalDateTime validUntil) {
        this.validUntil = validUntil;
    }
}
