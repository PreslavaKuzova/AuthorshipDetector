package features;

import java.util.List;

public class AverageSentenceLengthFeature extends Feature{

    private double calculate(List<String> words, List<String> sentences) {
        return (double) words.size() / sentences.size();
    }
}
