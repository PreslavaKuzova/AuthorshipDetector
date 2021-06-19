package com;

import analyzer.Feature;
import analyzer.FeatureType;

import java.util.List;

public class AverageSentenceLengthFeature extends Feature {

    public AverageSentenceLengthFeature() {
        super(FeatureType.AVERAGE_SENTENCE_LENGTH);
    }

    private double calculate(List<String> words, List<String> sentences) {
        return (double) words.size() / sentences.size();
    }
}
