public class GradedAssignment {
    private Assignment assignment;
    private Integer myGrade;

    public Assignment getAssignment() {
        return assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public Integer getMyGrade() {
        return myGrade;
    }

    public void setMyGrade(Integer myGrade) {
        this.myGrade = myGrade;
    }

    public Integer grade(Double points) {
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

    public boolean isGraded() {
        if (this.myGrade == null) {
            return false;
        } else if (this.myGrade >= 1 && this.myGrade <= 5) {
            return true;
        } else {
            return false;                           // here should be an exception handling!!!!
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GradedAssignment that = (GradedAssignment) o;

        if (assignment != null ? !assignment.equals(that.assignment) : that.assignment != null) return false;
        return myGrade != null ? myGrade.equals(that.myGrade) : that.myGrade == null;
    }

    @Override
    public int hashCode() {
        int result = assignment != null ? assignment.hashCode() : 0;
        result = 31 * result + (myGrade != null ? myGrade.hashCode() : 0);
        return result;
    }
}
