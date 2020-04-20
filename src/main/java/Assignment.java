import java.util.Objects;

public class Assignment {
    private String name;
    private Double maxPoints;
    private Double points;

    public Assignment(String name, Double maxPoints) {
        this.name = name;
        this.maxPoints = maxPoints;
    }

    public Assignment() {
        this.name = "unknown";
        this.maxPoints = null;
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
        Integer grade = null;
        if (percentage >= 0 && percentage < 50) {
            grade = 5;
        } else if (percentage >= 50 && percentage < 65) {
            grade = 4;
        } else if (percentage >= 65 && percentage < 80) {
            grade = 3;
        } else if (percentage >= 80 && percentage < 90) {
            grade = 2;
        } else if (percentage >= 90 && percentage <= 100) {
            grade = 1;
        } else {
            System.out.println("This is not a valid value!");
        }
        return grade;
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
