public class Main {
    public static void main(String[] args) {
        Assignment ass01 = new Assignment("assignment01", 200.00);
        System.out.println("grade: " + ass01.grade(190.00));

        Student student1 = new Student("Manfred Muster", 000001);
        student1.enroll(mathematik);
        student1.enroll(deutsch);
        student1.enroll(geschichte);
        student1.enroll(informatik);
        student1.enroll(musik);
        student1.enroll(turnen);

        System.out.println(student1.getLectures());

    }
}
