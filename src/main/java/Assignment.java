import java.util.Objects;

public class Assignment {
    private String name;
    private Double maxPoints;
    private Double points;
    public Integer myGrade = null;

    public Assignment(String name, Double maxPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
        this.myGrade = null;
    }

    public Assignment() {
        this.name = "unknown";
        this.maxPoints = null;
        this.myGrade = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getMaxPoints() {
        return maxPoints;
    }

    public void setMaxPoints(Double maxPoints) {
        this.maxPoints = maxPoints;
    }

    public Integer grade(Double points) {
        Double percentage = 100 * points / this.maxPoints;
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
        Assignment that = (Assignment) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(maxPoints, that.maxPoints) &&
                Objects.equals(points, that.points);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, maxPoints, points);
    }

    @Override
    public String toString() {
        return "Assignment{" +
                "name='" + name + '\'' +
                ", maxPoints=" + maxPoints +
                ", points=" + points +
                '}';
    }
}
