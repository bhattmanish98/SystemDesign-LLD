import java.util.List;

public abstract class StudentBuilder {
    String rollNumber;
    String studentName;
    String fatherName;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
        return this;
    }

    public StudentBuilder setStudentName(String studentName) {
        this.studentName = studentName;
        return this;
    }

    public StudentBuilder setFatherName(String fatherName) {
        this.fatherName = fatherName;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    abstract public StudentBuilder setSubjects();

    public Student build() {
        return new Student(this);
    }
}
