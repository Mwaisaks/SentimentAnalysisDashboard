package com.mwaisaka.SentimentAnalysisDashboard.service;

import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentRequest;
import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentResponse;

public interface SentimentService {
    SentimentResponse analyzeSentiment(SentimentRequest request);
}
