package com.mwaisaka.SentimentAnalysisDashboard.service;

import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentRequest;
import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentResponse;
import org.springframework.stereotype.Service;

@Service
public class SentimentServiceImpl implements SentimentService{

    @Override
    public SentimentResponse analyzeSentiment(SentimentRequest request) {

        //TODO: call ML model here

        //Mock response for now(replace with real ML integration)
        return new SentimentResponse("POSITIVE", 0.92);
    }
}
