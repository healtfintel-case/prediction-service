package com.arslankucukkafa.dev.predictionservice.dto;

public class PredictionResultDto {

    private double predictionCost;
    private String predictedCoverage;

    public PredictionResultDto() {}
    public PredictionResultDto(double predictionCost, String predictedCoverage) {
        this.predictionCost = predictionCost;
        this.predictedCoverage = predictedCoverage;
    }

    public String getPredictedCoverage() {
        return predictedCoverage;
    }

    public void setPredictedCoverage(String predictedCoverage) {
        this.predictedCoverage = predictedCoverage;
    }

    public double getPredictionCost() {
        return predictionCost;
    }

    public void setPredictionCost(double predictionCost) {
        this.predictionCost = predictionCost;
    }
}
