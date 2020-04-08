import java.util.ArrayList;
import java.util.List;

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
}
