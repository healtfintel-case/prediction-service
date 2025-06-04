package com.arslankucukkafa.dev.predictionservice.controller;

import com.arslankucukkafa.dev.predictionservice.dto.PredictionRequestDto;
import com.arslankucukkafa.dev.predictionservice.dto.PredictionResultDto;
import com.arslankucukkafa.dev.predictionservice.service.PredicationService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/predication")
public class PredicationController {

    private final PredicationService predicationService;

    public PredicationController(PredicationService predicationService) {
        this.predicationService = predicationService;
    }

    @GetMapping("/calculate")
    public ResponseEntity<PredictionResultDto> calculateInsuraPrediction(@RequestBody PredictionRequestDto predictionRequestDto) {
        return new ResponseEntity<>(
                predicationService.calculateInsurancePrediction(predictionRequestDto),
                org.springframework.http.HttpStatus.OK
        );

    }

}
