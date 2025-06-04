package com.arslankucukkafa.dev.predictionservice.entity;

import jakarta.persistence.*;

import java.util.List;

/**
 * Sigorta tarihçesi*/
@Entity
@Table(name = "insurance_histories")
public class InsuranceHistory extends BaseEntity {

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "insurance_policy_id")
    private InsurancePolicy insurancePolicy;

    @Column(name = "user_id")
    private String user;

    @OneToMany(mappedBy = "insuranceHistory", cascade = CascadeType.ALL)
    private List<InsuranceClaim> insuranceClaims;

    public InsurancePolicy getInsurancePolicy() {
        return insurancePolicy;
    }

    public void setInsurancePolicy(InsurancePolicy insurancePolicy) {
        this.insurancePolicy = insurancePolicy;
    }

    public List<InsuranceClaim> getInsuranceClaims() {
        return insuranceClaims;
    }
    public void setInsuranceClaims(List<InsuranceClaim> insuranceClaims) {
        this.insuranceClaims = insuranceClaims;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
