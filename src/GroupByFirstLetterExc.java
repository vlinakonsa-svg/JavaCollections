import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class GroupByFirstLetterExc {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Alice", "Bob", "Anna", "Charlie",
                "Brian", "Amanda", "Carl"
        );

        Map<Character, List<String>> groups = new TreeMap<>();

        for (String name : names) {
            char firstLetter = name.charAt(0);

            if (!groups.containsKey(firstLetter)) {
                groups.put(firstLetter, new ArrayList<>());
            }

            groups.get(firstLetter).add(name);
        }

        for (Map.Entry<Character, List<String>> group : groups.entrySet()) {
            System.out.println(group.getKey() + ": " + group.getValue());
        }
    }
}