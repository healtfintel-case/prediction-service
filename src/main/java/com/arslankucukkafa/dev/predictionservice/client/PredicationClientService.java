package com.arslankucukkafa.dev.predictionservice.client;

import com.arslankucukkafa.dev.predictionservice.dto.PredictionRequestDto;
import com.arslankucukkafa.dev.predictionservice.dto.PredictionResultDto;

public interface PredicationClientService {

    PredictionResultDto getPredictionResult(PredictionRequestDto predictionRequestDto);

}
