package owlcounter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class OwlCounter {
    private List<String> owls = new ArrayList<>();

    public void readFromFile(Path path) {
        try {
            owls = Files.readAllLines(path);
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file.", ioe);
        }
    }

    public int getNumberOfOwls(String county) {
        for (String actual : owls) {
            if (actual.startsWith(county)) {
                return Integer.parseInt(actual.substring(county.length() + 1));
            }
        }
        throw new IllegalArgumentException("No such county in Hungary!");
    }

    public int getNumberOfAllOwls() {
        int sum = 0;
        for (String actual : owls) {
            String[] values = actual.split("=");
            sum += Integer.parseInt(values[1]);
        }
        return sum;
    }
}
