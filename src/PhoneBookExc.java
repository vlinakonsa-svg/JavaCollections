import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBookExc {
    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        phoneBook.put("Anna", "070-111-1111");
        phoneBook.put("Bob", "070-222-2222");
        phoneBook.put("Charlie", "070-333-3333");
        phoneBook.put("Diana", "070-444-4444");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name to look up: ");
        String name = scanner.nextLine();

        if (phoneBook.containsKey(name)) {
            System.out.println("Phone number: " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }
}