import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private Integer studentID;
    private List<LectureParticipation> lectures;
    private LectureParticipation lectureParticipation;

    public Student(String name, Integer studentID) {
        this.name = name;
        this.studentID = studentID;
        this.lectures = new ArrayList<>();
        this.lectureParticipation = new LectureParticipation();
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

    public List<LectureParticipation> getLectures() {

        return this.lectures;
    }

    public Lecture getLecture(Lecture lecture) {
        Integer myIndex = null;
        for (int i = 0; i < lectures.size(); i++) {
            System.out.println(lectures.get(i));
            if (lectures.get(i).getLecture() == lecture) {

                myIndex = i;
            }
        }


        return lectures.get(myIndex).getLecture();
    }

    public void enroll(Lecture lecture) {

        this.lectureParticipation.setLecture(lecture);
        this.lectures.add(lectureParticipation);
    }

    public void getSchoolReport() {
        for (LectureParticipation l : this.lectures) {
            System.out.printf("12%s ........... 2%d", l.getLecture(), l.getGrade());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        if (studentID != null ? !studentID.equals(student.studentID) : student.studentID != null) return false;
        if (lectures != null ? !lectures.equals(student.lectures) : student.lectures != null) return false;
        return lectureParticipation != null ? lectureParticipation.equals(student.lectureParticipation) : student.lectureParticipation == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (studentID != null ? studentID.hashCode() : 0);
        result = 31 * result + (lectures != null ? lectures.hashCode() : 0);
        result = 31 * result + (lectureParticipation != null ? lectureParticipation.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", lectures=" + lectures +
                ", lectureParticipation=" + lectureParticipation +
                '}';
    }
}
