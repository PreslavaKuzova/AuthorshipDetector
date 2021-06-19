package com;

import analyzer.Feature;
import analyzer.FeatureType;

import java.util.List;

public class AverageWordLengthFeature extends Feature {

    public AverageWordLengthFeature() {
        super(FeatureType.AVERAGE_WORD_LENGTH);
    }

    public double calculate(List<String> words) {
        return words
                .stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();
    }
}
