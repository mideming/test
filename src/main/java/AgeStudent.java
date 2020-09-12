public class AgeStudent implements StudentFilter {
    @Override
    public boolean compare(Student student) {
        return student.getAge() > 14;
    }
}
