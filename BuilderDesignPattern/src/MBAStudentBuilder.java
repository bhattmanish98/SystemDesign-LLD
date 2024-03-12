import java.util.Arrays;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects() {
        this.subjects = Arrays.asList("Marketing", "Product");
        return this;
    }
}
