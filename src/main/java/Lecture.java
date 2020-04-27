import java.util.ArrayList;
import java.util.List;

public class Lecture {
    public String name;

    public List<Assignment> lectureAssignments;

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

    public Integer getGrade() {
        Integer allGrades = null;
        int count = 0;
        for (int i = 0; i < this.lectureAssignments.size(); i++) {
            if (this.lectureAssignments.get(i).isGraded()) {
                allGrades += this.lectureAssignments.get(i).myGrade;
                count++;
            }
        }
        return allGrades / count;
    }
}
