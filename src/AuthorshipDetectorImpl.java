import java.io.InputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

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
