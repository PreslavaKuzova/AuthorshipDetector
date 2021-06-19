import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Collections;
import java.util.stream.Collectors;

public class TextReader {
    public Collection<String> read(InputStream mysteryText) {
        Collection<String> lines = Collections.emptyList();
        try (BufferedReader buffer = new BufferedReader(new InputStreamReader(mysteryText))) {
            lines = buffer.lines().collect(Collectors.toList());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lines;
    }
}
