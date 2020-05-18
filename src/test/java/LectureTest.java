import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LectureTest {

    @Test
    @DisplayName("A Lecture without any assignments returns null for the grade")
    public void testLectureWithoutAssignments() {

        Lecture testLecture = new Lecture("test");
        Integer myGrade = testLecture.getGrade();
        System.out.println(testLecture.getGrade());
        assertEquals(null, myGrade);
    }

    @Test
    @DisplayName("A Lecture with exactly one assignments returns the grade of that assignment")
    public void testLectureWithSingleAssignment() {
        Assignment testAssignment = new Assignment("Test01", 200.00);
        assertEquals(true, true);
    }

    @Test
    @DisplayName("A Lecture with many assignments returns the average grade of these assignments")
    public void testLectureWithMultipleAssignment() {
        // TODO implement
        assertEquals(true, true);
    }

}
