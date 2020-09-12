import java.util.ArrayList;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(new Student("a",11,21));
        list.add(new Student("b",12,22));
        list.add(new Student("c",13,23));
        list.add(new Student("d",14,24));
        list.add(new Student("e",15,25));
        list.add(new Student("f",16,26));
        getByFilter(list, (a) -> a.getAge() < 14);
    }

    private static List<Student> getByFilter(List<Student> list, StudentFilter studentFilter) {
        List<Student> students = new ArrayList<>();
        for (Student student : list) {
            if(studentFilter.compare(student)) {
                students.add(student);
            }
        }
        for (Student student : students) {
            System.out.println(student);
        }
        return students;
    }
}
