package com.vso.detector;

import java.io.InputStream;

public class AuthorshipDetectorImpl implements AuthorshipDetector {

    @Override
    public LinguisticSignature calculateSignature(InputStream mysteryText) {
        return null;
    }

    @Override
    public double calculateSimilarity(LinguisticSignature firstSignature, LinguisticSignature secondSignature) {
        return 0;
    }

    @Override
    public String findAuthor(InputStream mysteryText) {
        return null;
    }

}
