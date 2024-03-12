public class Director {
    StudentBuilder studentBuilder;

    Director(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student createStudent() {
        if(studentBuilder instanceof MBAStudentBuilder) {
            return createMBAStudent();
        } else if (studentBuilder instanceof EngineeringStudentBuilder){
            return createEngineeringStudent();
        }
        return null;
    }

    private Student createEngineeringStudent() {
        return new EngineeringStudentBuilder()
                .setRollNumber("123")
                .setStudentName("ABC")
                .setFatherName("XYZ")
                .setMotherName("PQR")
                .setSubjects().build();
    }

    private Student createMBAStudent() {
        return new MBAStudentBuilder()
                .setRollNumber("1234")
                .setStudentName("ABCD")
                .setFatherName("WXYZ")
                .setMotherName("PQRS")
                .setSubjects().build();
    }
}
