package com.arslankucukkafa.dev.predictionservice.service;

import com.arslankucukkafa.dev.predictionservice.client.PredicationClientService;
import com.arslankucukkafa.dev.predictionservice.dto.PredictionRequestDto;
import com.arslankucukkafa.dev.predictionservice.dto.PredictionResultDto;
import org.springframework.stereotype.Service;

@Service
public class PredicationService {

    private final PredicationClientService predicationClientService;


    public PredicationService(PredicationClientService predicationClientService) {
        this.predicationClientService = predicationClientService;
    }

    public PredictionResultDto calculateInsurancePrediction(PredictionRequestDto predictionRequestDto) {
        return predicationClientService.getPredictionResult(predictionRequestDto);
    }
}
