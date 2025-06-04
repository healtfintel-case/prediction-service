package com.arslankucukkafa.dev.predictionservice.client.impl;

import com.arslankucukkafa.dev.predictionservice.client.PredicationClientService;
import com.arslankucukkafa.dev.predictionservice.dto.PredictionRequestDto;
import com.arslankucukkafa.dev.predictionservice.dto.PredictionResultDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class PredicationClientServiceImpl implements PredicationClientService {

    private final WebClient webClient;

    public PredicationClientServiceImpl(@Value("${python.prediction-service.url}") String baseUrl) {
        this.webClient = WebClient.builder().baseUrl(baseUrl).build();
    }

    @Override
    public PredictionResultDto getPredictionResult(PredictionRequestDto predictionRequestDto) {
        try {
           return webClient.post()
                    .uri("/api/predict-cost")
                    .bodyValue(predictionRequestDto)
                    .retrieve()
                    .bodyToMono(PredictionResultDto.class)
                    .block();
        } catch (Exception e) {
            return new PredictionResultDto(1000, "Health insurance prediction service is not available at the moment. Please try again later.");
        }
    }
}
