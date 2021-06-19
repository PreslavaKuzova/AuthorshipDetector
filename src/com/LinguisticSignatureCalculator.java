package com;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LinguisticSignatureCalculator {

    public LinguisticSignature calculateSignature(List<String> words, List<String> sentences) {
        Map<FeatureType, Double> signature = new HashMap<>();

//        for (Feature feature : ) {
//            signature.put(type, )
//        }

        return new LinguisticSignature(signature);
    }

    public double calculateSimilarities(LinguisticSignature signature1, LinguisticSignature signature2) {
        double result = 0;
        for (FeatureType type : FeatureType.values()) {
            result += Math.abs(signature1.getFeatures().get(type)
                    - signature2.getFeatures().get(type)) * type.getWeight();
        }

        return result;
    }
}
