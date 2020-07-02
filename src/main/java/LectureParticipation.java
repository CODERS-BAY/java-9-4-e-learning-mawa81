import java.util.List;

public class LectureParticipation {
    private Lecture lecture;
    private List<GradedAssignment> gradedAssignments;

    public LectureParticipation(Lecture lecture, List<GradedAssignment> gradedAssignments) {
        this.lecture = lecture;
        this.gradedAssignments = gradedAssignments;
    }

    public LectureParticipation() {
        this.lecture = null;
        this.gradedAssignments = null;
    }

    public Lecture getLecture() {
        return lecture;
    }

    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public Assignment getLectureAssignment(Assignment assignment) {
        return gradedAssignments.get(gradedAssignments.indexOf(assignment)).getAssignment();
    }

    public List<GradedAssignment> getGradedAssignments() {
        return gradedAssignments;
    }

    public void setGradedAssignments(List<GradedAssignment> gradedAssignments) {
        this.gradedAssignments = gradedAssignments;
    }

    public void grade(Assignment assignment, Double points) {
        this.gradedAssignments.get(this.gradedAssignments.indexOf(assignment)).grade(points);
    }

    public Integer getGrade() {
        Integer allGrades = null;
        if (gradedAssignments.size() > 0) {
            int count = 0;
            for (int i = 0; i < this.gradedAssignments.size(); i++) {
                if (this.gradedAssignments.get(i).isGraded()) {
                    allGrades += this.gradedAssignments.get(i).getMyGrade();
                    count++;
                }
            }
            return allGrades / count;
        } else {
            return allGrades;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LectureParticipation that = (LectureParticipation) o;

        if (lecture != null ? !lecture.equals(that.lecture) : that.lecture != null) return false;
        return gradedAssignments != null ? gradedAssignments.equals(that.gradedAssignments) : that.gradedAssignments == null;
    }

    @Override
    public int hashCode() {
        int result = lecture != null ? lecture.hashCode() : 0;
        result = 31 * result + (gradedAssignments != null ? gradedAssignments.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "LectureParticipation{" +
                "lecture=" + lecture +
                ", gradedAssignments=" + gradedAssignments +
                '}';
    }
}
