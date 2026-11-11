import java.util.List;

public class FindLargestExc {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(14, 3, 78, 45, 22, 91, 7, 56);

        int largest = numbers.get(0);

        for (int number : numbers) {
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Largest number: " + largest);
    }
}