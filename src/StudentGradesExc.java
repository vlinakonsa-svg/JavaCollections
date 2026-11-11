import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentGradesExc {

    // HashMap stores each name with one grade. I will sort the names by grade when printing.
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();

        grades.put("Anna", 92);
        grades.put("Bob", 76);
        grades.put("Charlie", 88);
        grades.put("Diana", 95);
        grades.put("Eric", 81);
        grades.put("Fatima", 88);

        List<String> students = new ArrayList<>(grades.keySet());

        students.sort((name1, name2) ->
                Integer.compare(grades.get(name2), grades.get(name1)));

        for (String student : students) {
            System.out.println(student + ": " + grades.get(student));
        }
    }
}