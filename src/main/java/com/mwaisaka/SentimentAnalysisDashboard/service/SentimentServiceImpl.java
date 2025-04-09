package com.mwaisaka.SentimentAnalysisDashboard.service;

import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentRequest;
import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SentimentServiceImpl implements SentimentService{

    @Value("${ml.service.url}")
    private String mlServiceUrl;

    @Override
    public SentimentResponse analyzeSentiment(SentimentRequest request) {

        //TODO: call ML model here


        //Mock response for now(replace with real ML integration)
        return new SentimentResponse("POSITIVE", 0.92);
    }
}
