package com.arslankucukkafa.dev.predictionservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Table;

import java.time.LocalDateTime;

/**
 * Sigorta tahmini hesaplama tutarı*/
@Entity
@Table(name = "prediction_results")
public class PredictionResult extends BaseEntity{

    private Double predictedCost;
    private Double predictedCoverage;
    private LocalDateTime calculationDate;
    @Column(name = "user_id")
    private String user;

    public LocalDateTime getCalculationDate() {
        return calculationDate;
    }

    public void setCalculationDate(LocalDateTime calculationDate) {
        this.calculationDate = calculationDate;
    }

    public Double getPredictedCost() {
        return predictedCost;
    }

    public void setPredictedCost(Double predictedCost) {
        this.predictedCost = predictedCost;
    }

    public Double getPredictedCoverage() {
        return predictedCoverage;
    }

    public void setPredictedCoverage(Double predictedCoverage) {
        this.predictedCoverage = predictedCoverage;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
}
