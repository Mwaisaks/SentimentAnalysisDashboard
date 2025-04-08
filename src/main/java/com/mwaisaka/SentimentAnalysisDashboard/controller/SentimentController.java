package com.mwaisaka.SentimentAnalysisDashboard.controller;

import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentRequest;
import com.mwaisaka.SentimentAnalysisDashboard.dto.SentimentResponse;
import com.mwaisaka.SentimentAnalysisDashboard.service.SentimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/analyze")
public class SentimentController {

    private SentimentService sentimentService;

    @Autowired
    public SentimentController(SentimentService sentimentService){
        this.sentimentService = sentimentService;
    } //Constructor injection

    @PostMapping("/single")
    public SentimentResponse analyzeSingleText(@RequestBody SentimentRequest request){
        return sentimentService.analyzeSentiment(request);
    }
}
