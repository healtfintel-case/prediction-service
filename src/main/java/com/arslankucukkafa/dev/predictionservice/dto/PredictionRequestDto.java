package com.arslankucukkafa.dev.predictionservice.dto;

import java.util.List;

public class PredictionRequestDto {
    private Integer age;
    private List<String> medicalHistory;
    private String insuranceType;
    private String preferredHospital;

    public PredictionRequestDto() {}

    public PredictionRequestDto(Integer age, List<String> medicalHistory, String insuranceType, String preferredHospital) {
        this.age = age;
        this.medicalHistory = medicalHistory;
        this.insuranceType = insuranceType;
        this.preferredHospital = preferredHospital;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<String> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getInsuranceType() {
        return insuranceType;
    }

    public void setInsuranceType(String insuranceType) {
        this.insuranceType = insuranceType;
    }

    public String getPreferredHospital() {
        return preferredHospital;
    }

    public void setPreferredHospital(String preferredHospital) {
        this.preferredHospital = preferredHospital;
    }
} 