package uniquefinder;

import java.util.ArrayList;
import java.util.List;

public class UniqueFinder {
    public List<Character> getUniqueChars(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Text is null.");
        }
        List<Character> results = new ArrayList<>();
        for (Character c : input.toCharArray()) {
            if(!results.contains(c)) {
                results.add(c);
            }
        }
        return results;
    }
}
