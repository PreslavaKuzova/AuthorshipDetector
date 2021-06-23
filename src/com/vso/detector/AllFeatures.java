package com.vso.detector;

import com.vso.detector.analyzer.features.*;

public class AllFeatures {
    private final Feature[] features;

    public AllFeatures() {
        this.features = new Feature[]{
                new AverageWordLengthFeature(),
                new TypeTokenRatioFeature(),
                new HapaxLegomenaRatioFeature(),
                new AverageSentenceLengthFeature(),
                new AverageSentenceComplexityFeature()
        };
    }

    Feature[] getAllFeatures() {
        return features;
    }
}
