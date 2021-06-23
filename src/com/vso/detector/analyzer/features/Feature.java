package com.vso.detector.analyzer.features;

import java.util.List;

public abstract class Feature {
    protected FeatureType type;

    public Feature(FeatureType type) {
        this.type = type;
    }

    public abstract double calculate(List<String> words, List<String> sentences);

    public FeatureType getType() {
        return type;
    }
}
