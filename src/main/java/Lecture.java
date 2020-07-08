import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class Lecture {
    private String name;

    private HashSet<Assignment> lectureAssignments;
    private HashSet<GradedAssignment> gradedAssignments;

    public Lecture(String name) {
        this.setName(name);
        this.lectureAssignments = new HashSet<Assignment>();
        this.gradedAssignments = new HashSet<GradedAssignment>();
    }

    public HashSet<GradedAssignment> getGradedAssignments() {
        return gradedAssignments;
    }

    public void setGradedAssignments(HashSet<GradedAssignment> gradedAssignments) {
        this.gradedAssignments = gradedAssignments;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public HashSet<Assignment> getLectureAssignments() {
        return lectureAssignments;
    }

    public void setLectureAssignments(HashSet<Assignment> lectureAssignments) {
        this.lectureAssignments = lectureAssignments;
    }

    public void addAssignment(Assignment lectureAssignment) {
        this.lectureAssignments.add(lectureAssignment);
    }

    public void removeAssignment(Assignment lectureAssignment) {
        this.lectureAssignments.remove(lectureAssignment);
    }

    public Integer getGrade() {
        Integer allGrades = null;

        if (gradedAssignments.size() > 0) {
            int count = 0;
            for (int i = 0; i < this.gradedAssignments.size(); i++) {
                Iterator it = gradedAssignments.iterator();
                while (it.hasNext()) {
                    System.out.println(it.next());
               /* if (this.lectureAssignments.get(i).isGraded()) {
                    allGrades += this.lectureAssignments.get(i).getMyGrade();
                    count++;
                }*/
                }
            }
            return allGrades / count;
        } else {
            return allGrades;
        }
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
