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
