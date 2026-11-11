import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCitiesExc {
    public static void main(String[] args) {
        Set<String> cities = new LinkedHashSet<>();

        cities.add("Stockholm");
        cities.add("Gothenburg");
        cities.add("Malmö");
        cities.add("Stockholm");
        cities.add("Uppsala");
        cities.add("Gothenburg");
        cities.add("Lund");

        System.out.println("Unique cities: " + cities);
        System.out.println("Total count: " + cities.size());
    }
}