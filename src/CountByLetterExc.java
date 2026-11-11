import java.util.List;
import java.util.Scanner;

public class CountByLetterExc {
    public static void main(String[] args) {
        List<String> names = List.of(
                "Anna", "Bob", "Alice", "Charlie",
                "Amanda", "David", "Amy", "Brian"
        );

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        String letter = scanner.nextLine().trim().toLowerCase();

        int count = 0;

        for (String name : names) {
            if (name.toLowerCase().startsWith(letter)) {
                count++;
            }
        }

        System.out.println("Names starting with " + letter + ": " + count);
    }
}