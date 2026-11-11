import java.util.HashMap;
import java.util.Map;

public class MostFrequentWordExc {
    public static void main(String[] args) {
        String[] words = {
                "cat", "dog", "cat", "bird", "dog",
                "cat", "fish", "dog", "dog"
        };

        Map<String, Integer> counts = new HashMap<>();

        for (String word : words) {
            counts.put(word, counts.getOrDefault(word, 0) + 1);
        }

        String mostFrequentWord = "";
        int highestCount = 0;

        for (Map.Entry<String, Integer> entry : counts.entrySet()) {
            if (entry.getValue() > highestCount) {
                mostFrequentWord = entry.getKey();
                highestCount = entry.getValue();
            }
        }

        System.out.println("Most frequent word: " + mostFrequentWord);
        System.out.println("Count: " + highestCount);
    }
}