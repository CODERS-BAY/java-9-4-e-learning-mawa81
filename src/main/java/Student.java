import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {
    private String name;
    private Integer studentID;
    private List<Lecture> lectures;

    public Student(String name, Integer studentID) {
        this.name = name;
        this.studentID = studentID;
        this.lectures = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void enroll(Lecture lecture) {
        this.lectures.add(lecture);
    }

    public void getSchoolReport() {
        for (Lecture l : this.lectures) {
            System.out.printf("12%s ........... 2%d", l.name, l.getGrade());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(studentID, student.studentID) &&
                Objects.equals(lectures, student.lectures);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID, lectures);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", lectures=" + lectures +
                '}';
    }
}
