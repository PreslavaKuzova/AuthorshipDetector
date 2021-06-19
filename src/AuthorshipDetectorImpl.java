import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AuthorshipDetectorImpl implements AuthorshipDetector {

    private final List<String> words;
    private final List<String> sentences;

    public AuthorshipDetectorImpl(TextReader reader, TextStripper stripper, InputStream mysteryText) {
        Collection<String> lines = reader.read(mysteryText);
        words = stripper.generateCleanStringCollection(lines);
        sentences = stripper.generateCleanSentenceCollection(lines);
    }

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

    private double calculateAverageWordLength() {
        return this.words
                .stream()
                .mapToInt(String::length)
                .average()
                .getAsDouble();
    }

    private double calculateTypeTokenRatio() {
        return (double) this.words.stream().distinct().count() / this.words.size();
    }


    private double calculateHapaxLegomenaRatio() {

        Map<String, Long> occurrences = this.words.stream().collect(
                Collectors.groupingBy(Function.identity(), Collectors.counting()));

        occurrences.entrySet().removeIf(entry -> entry.getValue() > 1);

        return (double) occurrences.size() / this.words.size();
    }

    private double calculateAverageSentenceLength() {
        return (double) this.words.size() / this.sentences.size();
    }

    private double calculateAverageSentenceComplexity() {
        long numberOfPhrases = this.sentences.stream()
                .filter(s -> s.matches(".*[\\,\\;\\:].*"))
                .map(s -> s.split("[,|\\:|\\;]"))
                .flatMap(Arrays::stream)
                .count();

        return (double) numberOfPhrases / this.sentences.size();
    }

}
