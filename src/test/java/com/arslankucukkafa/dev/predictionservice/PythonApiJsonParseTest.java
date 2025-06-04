package com.arslankucukkafa.dev.predictionservice;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PythonApiJsonParseTest {

    /**
     * Pyhton apiden gelecek response degerini düzgün alaibilmek için modelin spring boot tarafındaki karşılıgı
     * birebir şekilde olmalı ve degerleri tam olarak karşılamalı, Dönebilecek tüm model tipleri için esnek olmalı
     * */

    static class PredictionResponse {
        public double predictedCost;
        public double predictedCoverage;
    }

    private static final String JSON_RESPONSE = "{" +
            "\"predictedCost\": 8500.0," +
            "\"predictedCoverage\": 9000.0" +
            "}";

    @Test
    void testParsePythonApiJson() throws Exception {

        ObjectMapper mapper = new ObjectMapper();
        PredictionResponse response = mapper.readValue(JSON_RESPONSE, PredictionResponse.class);
        assertEquals(8500.0, response.predictedCost);
        assertEquals(9000.0, response.predictedCoverage);
    }


} 