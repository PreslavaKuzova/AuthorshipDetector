package features;

import java.util.Arrays;
import java.util.List;

public class AverageSentenceComplexityFeature extends Feature {
    public double calculate(List<String> sentences) {
        long numberOfPhrases = sentences.stream()
                .filter(s -> s.matches(".*[\\,\\;\\:].*"))
                .map(s -> s.split("[,|\\:|\\;]"))
                .flatMap(Arrays::stream)
                .count();

        return (double) numberOfPhrases / sentences.size();
    }

}
