import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Comparator<Student> reverseGrade = new GradeComparator().reversed();
        Comparator<Student> age = Comparator.comparingInt(Student::getAge);

        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 10, 20));
        students.add(new Student("Bob", 12, 22));
        students.add(new Student("Charlie", 9, 19));
        students.add(new Student("David", 11, 21));
        students.add(new Student("Eve", 10, 20));

        students.sort(reverseGrade.thenComparing(age));

        for (Student student : students) {
            System.out.println(student);
        }
    }
}