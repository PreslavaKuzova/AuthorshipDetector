package features;

import java.util.List;

public class TypeTokenRatioFeature extends Feature {
    public double calculate(List<String> words) {
        return (double) words.stream().distinct().count() / words.size();
    }
}
