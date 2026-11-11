import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MergeListsExc {
    public static void main(String[] args) {
        List<Integer> listA = List.of(1, 2, 3, 4, 5);
        List<Integer> listB = List.of(3, 4, 5, 6, 7);

        Set<Integer> merged = new LinkedHashSet<>();
        merged.addAll(listA);
        merged.addAll(listB);

        System.out.println("Merged: " + merged);
        System.out.println("Total count: " + merged.size());
    }
}