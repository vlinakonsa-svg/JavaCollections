import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesExc {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(4, 7, 2, 7, 9, 4, 1, 9, 3);
        Set<Integer> seen = new HashSet<>();
        List<Integer> uniqueNumbers = new ArrayList<>();

        for (int number : numbers) {
            if (seen.add(number)) {
                uniqueNumbers.add(number);
            }
        }

        System.out.println("Without duplicates: " + uniqueNumbers);
    }
}