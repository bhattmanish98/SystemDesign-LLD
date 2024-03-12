import java.util.List;

public class Student {
    String rollNumber;
    String studentName;
    String fatherName;
    String motherName;
    List<String> subjects;

    public Student(StudentBuilder studentBuilder) {
        this.rollNumber = studentBuilder.rollNumber;
        this.studentName = studentBuilder.studentName;
        this.fatherName = studentBuilder.fatherName;
        this.motherName = studentBuilder.motherName;
        this.subjects = studentBuilder.subjects;
    }

    public String toString() {
        return "Roll Number: " + this.rollNumber
                + " Student Name: " + this.studentName
                + " Father's Name: " + this.fatherName
                + " Mother's Name: " + this.motherName
                + " Subject: " + subjects;
    }
}
