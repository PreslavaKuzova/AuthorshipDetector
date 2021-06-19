package com;

import java.util.Arrays;
import java.util.List;

public class AverageSentenceComplexityFeature extends Feature {
    //private static final double FEATURE_WEIGHT = 0.4;
    //  public AverageSentenceComplexityFeature(double weight) {
    //  super(FeatureType.AVERAGE_SENTENCE_COMPLEXITY);
    //}
    public AverageSentenceComplexityFeature() {
        super(FeatureType.AVERAGE_SENTENCE_COMPLEXITY);
    }

    public double calculate(List<String> sentences) {
        long numberOfPhrases = sentences.stream()
                .filter(s -> s.matches(".*[\\,\\;\\:].*"))
                .map(s -> s.split("[,|\\:|\\;]"))
                .flatMap(Arrays::stream)
                .count();

        return (double) numberOfPhrases / sentences.size();
    }

}
