public class Main {
    public static void main(String[] args) {


        Assignment assMath01 = new Assignment("Assignment_Mathematik_01", 200.00);
        Assignment assMath02 = new Assignment("Assignment_Mathematik_02", 150.00);
        Assignment assMath03 = new Assignment("Assignment_Mathematik_03", 180.00);

        Lecture mathematik = new Lecture("Mathematik");

        mathematik.addAssignment(assMath01);
        mathematik.addAssignment(assMath02);
        mathematik.addAssignment(assMath03);
        System.out.println(mathematik.toString());
        mathematik.removeAssignment(assMath02);
        System.out.println(mathematik.toString());
        mathematik.addAssignment(assMath02);
        System.out.println(mathematik.toString());

        Assignment assDeut01 = new Assignment("Assignment_Deutsch_01", 250.00);
        Assignment assDeut02 = new Assignment("Assignment_Deutsch_02", 140.00);
        Assignment assDeut03 = new Assignment("Assignment_Deutsch_03", 100.00);

        Lecture deutsch = new Lecture("Deutsch");

        deutsch.addAssignment(assDeut01);
        deutsch.addAssignment(assDeut02);
        deutsch.addAssignment(assDeut03);

        System.out.println(deutsch.toString());

        Assignment assGesch01 = new Assignment("Assignment_Geschichte_01", 150.00);
        Assignment assGesch02 = new Assignment("Assignment_Geschichte_02", 120.00);
        Assignment assGesch03 = new Assignment("Assignment_Geschichte_03", 180.00);

        Lecture geschichte = new Lecture("Geschichte");

        geschichte.addAssignment(assGesch01);
        geschichte.addAssignment(assGesch02);
        geschichte.addAssignment(assGesch03);

        System.out.println(geschichte.toString());

        Assignment assInfo01 = new Assignment("Assignment_Informatik_01", 240.00);
        Assignment assInfo02 = new Assignment("Assignment_Informatik_02", 220.00);
        Assignment assInfo03 = new Assignment("Assignment_Informatik_03", 190.00);

        Lecture informatik = new Lecture("Informatik");

        Student student1 = new Student("Manfred Muster", 000001);

        LectureParticipation student1LP = new LectureParticipation(student1);
        student1LP.enroll(mathematik);
        student1LP.enroll(deutsch);
        student1LP.enroll(geschichte);
        student1LP.enroll(informatik);

        System.out.println();
        // student1.getLecture(mathematik).getLectureAssignments();
        System.out.println("getLectures " + student1LP.getLectures());

        student1LP.getLecture(mathematik).getGradedAssignments().

                student1LP.getSchoolReport();
        //student1.getSchoolReport();
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
