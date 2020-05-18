public class Main {
    public static void main(String[] args) {
        Assignment ass01 = new Assignment("assignment01", 200.00);
        Assignment ass02 = new Assignment("assignment02", 150.00);
        Assignment ass03 = new Assignment("assignment03", 180.00);
        Assignment ass04 = new Assignment("assignment04", 250.00);
        Assignment ass05 = new Assignment("assignment05", 140.00);
        Assignment ass06 = new Assignment("assignment06", 100.00);

        Lecture mathematik = new Lecture("Mathematik");

        mathematik.addAssignment(ass01);
        mathematik.addAssignment(ass02);
        mathematik.addAssignment(ass03);
        mathematik.removeAssignment(ass02);
        System.out.println(mathematik.getName());
        System.out.println(mathematik.getLectureAssignments());

        Lecture deutsch = new Lecture("Deutsch");

        Lecture geschichte = new Lecture("Geschichte");

        Lecture informatik = new Lecture("Informatik");

        Lecture musik = new Lecture("Musik");

        Lecture turnen = new Lecture("Turnen");

        Student student1 = new Student("Manfred Muster", 000001);
        student1.enroll(mathematik);
        student1.enroll(deutsch);
        student1.enroll(geschichte);
        student1.enroll(informatik);
        student1.enroll(musik);
        student1.enroll(turnen);

        System.out.println(student1.getLectures());

        System.out.println(student1.getLecture(mathematik));
        // System.out.println(student1.getLecture(mathematik).getName());
        //System.out.println(student1.getLecture(mathematik));


        //    System.out.println(student1.getName() + student1.getLectures());
        // student1.getSchoolReport();

        // System.out.println("Student1 " + student1.getLectures().get(student1.getLectures().indexOf(mathematik)));
        //student1.getLectures().get(student1.getLectures().indexOf(mathematik)).addAssignment(ass01);
        // System.out.println(student1.getLectures().get(student1.getLectures().indexOf(mathematik)).getLectureAssignments().get(student1.getLectures().get(student1.getLectures().indexOf(mathematik)).getLectureAssignments().indexOf(ass01)).grade(170.00));


        //  System.out.println("Student1 " + student1.getLectures().get(0).getName());
        //  System.out.println("Student1 " + student1.getLectures().get(0).getLectureAssignments());

        // System.out.println("Student1 " + student1.getLectures().toString());

    }
}
