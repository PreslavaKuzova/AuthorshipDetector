package features;

import java.util.List;

public class AverageWordLengthFeature extends Feature {
    public double calculate(List<String> words) {
        return words
                .stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();
    }
}
