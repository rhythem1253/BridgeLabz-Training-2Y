public class Result {

    private int studentId;
    private String courseName;
    private char grade;

    public Result(int studentId, String courseName, char grade) {
        this.studentId = studentId;
        this.courseName = courseName;
        this.grade = grade;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getCourseName() {
        return courseName;
    }

    public char getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentId + ", Course: " + courseName + ", Grade: " + grade;
    }
}
