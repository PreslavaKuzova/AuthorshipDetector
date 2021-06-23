package com.vso.detector.analyzer.features;

public enum FeatureType {
    AVERAGE_WORD_LENGTH(11),
    TYPE_TOKEN_RATIO(8),
    HAPAX_LEGOMENA_RATIO(6),
    AVERAGE_SENTENCE_LENGTH(5),
    AVERAGE_SENTENCE_COMPLEXITY(5);

    private double weight;

    FeatureType(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
}
