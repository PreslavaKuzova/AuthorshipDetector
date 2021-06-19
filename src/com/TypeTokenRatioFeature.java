package com;

import java.util.List;

public class TypeTokenRatioFeature extends Feature {

    public TypeTokenRatioFeature() {
        super(FeatureType.TYPE_TOKEN_RATIO);
    }

    public double calculate(List<String> words) {
        return (double) words.stream().distinct().count() / words.size();
    }
}
