import java.util.Map;
import java.util.TreeMap;

public class WordFrequencyExc {
    public static void main(String[] args) {
        String[] words = {
                "apple", "banana", "apple", "orange",
                "banana", "apple", "grape", "orange"
        };

        Map<String, Integer> counts = new TreeMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}