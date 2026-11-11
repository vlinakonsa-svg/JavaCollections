import java.util.HashSet;
import java.util.Set;

public class SubmissionTrackerExc {

    // HashSet fits because each student should appear once, and submission order does not matter.
    public static void main(String[] args) {
        Set<String> submittedStudents = new HashSet<>();

        String[] submissions = {
                "Anna", "Bob", "Charlie", "Diana", "Anna",
                "Eric", "Fatima", "Bob", "George", "Hana"
        };

        for (String student : submissions) {
            if (submittedStudents.add(student)) {
                System.out.println(student + " submitted.");
            } else {
                System.out.println("Duplicate rejected: " + student);
            }
        }

        System.out.println("Submitted students: " + submittedStudents);
    }
}