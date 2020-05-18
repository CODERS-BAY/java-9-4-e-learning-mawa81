import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Lecture {
    private String name;

    private List<Assignment> lectureAssignments;

    public Lecture(String name) {
        this.setName(name);
        this.lectureAssignments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public List<Assignment> getLectureAssignments() {
        return lectureAssignments;
    }

    public void addAssignment(Assignment lectureAssignment) {
        this.lectureAssignments.add(lectureAssignment);
    }

    public void removeAssignment(Assignment lectureAssignment) {
        this.lectureAssignments.remove(lectureAssignment);
    }


    @Override
    public String toString() {
        return "Lecture{" +
                "name='" + name + '\'' +
                ", lectureAssignments=" + lectureAssignments +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Lecture lecture = (Lecture) o;
        return Objects.equals(name, lecture.name) &&
                Objects.equals(lectureAssignments, lecture.lectureAssignments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lectureAssignments);
    }
}
