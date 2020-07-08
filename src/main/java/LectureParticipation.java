import java.util.ArrayList;
import java.util.List;

public class LectureParticipation {
    private Student student;
    private List<Lecture> lectures;

    public LectureParticipation(Student student) {
        this.student = student;
        this.lectures = new ArrayList<Lecture>();
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<Lecture> getLectures() {
        return lectures;
    }

    public void setLectures(List<Lecture> lectures) {
        this.lectures = lectures;
    }

    public Lecture getLecture(Lecture lecture) {
        return lectures.get(lectures.indexOf(lecture));
    }

    public Integer grade(Assignment assignment, Double points) {
        Double percentage = 100 * points / assignment.getMaxPoints();
        System.out.println(percentage);

        if (percentage >= 0 && percentage < 50) {
            myGrade = 5;
        } else if (percentage >= 50 && percentage < 65) {
            myGrade = 4;
        } else if (percentage >= 65 && percentage < 80) {
            myGrade = 3;
        } else if (percentage >= 80 && percentage < 90) {
            myGrade = 2;
        } else if (percentage >= 90 && percentage <= 100) {
            myGrade = 1;
        } else {
            System.out.println("This is not a valid value!");
        }

        return myGrade;
    }

    public void enroll(Lecture lecture) {
        lectures.add(lecture);
    }


    public void getSchoolReport() {
        System.out.println();
        System.out.println(getStudent().toString());
        System.out.println("---------------------------------------");
        System.out.println("     Fach:                     Note:");
        System.out.println("---------------------------------------");
        for (Lecture l : lectures) {
            System.out.printf("%12s .................. %2d\n", l.getName(), l.getGrade());
        }

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LectureParticipation that = (LectureParticipation) o;

        if (student != null ? !student.equals(that.student) : that.student != null) return false;
        return lectures != null ? lectures.equals(that.lectures) : that.lectures == null;
    }

    @Override
    public int hashCode() {
        int result = student != null ? student.hashCode() : 0;
        result = 31 * result + (lectures != null ? lectures.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LectureParticipation{" +
                "student=" + student +
                ", lectures=" + lectures +
                '}';
    }
}
