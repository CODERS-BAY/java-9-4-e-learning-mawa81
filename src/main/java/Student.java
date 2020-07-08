public class Student {
    private String name;
    private Integer studentID;
    //private LectureParticipation lectureParticipation;
    // private List<LectureParticipation> lectures;

    public Student(String name, Integer studentID) {
        this.name = name;
        this.studentID = studentID;
        //this.lectureParticipation = new LectureParticipation();
        // this.lectures = new ArrayList<LectureParticipation>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStudentID() {
        return studentID;
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }



   /* public Lecture getLecture(Lecture lecture) {
        Integer myIndex = null;
        for (int i = 0; i < lectures.size(); i++) {
            System.out.println(lectures.get(i));
            if (lectures.get(i).getLecture() == lecture) {

                myIndex = i;
            }
        }


        return lectures.get(myIndex).getLecture();
    }


    */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return studentID != null ? studentID.equals(student.studentID) : student.studentID == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (studentID != null ? studentID.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", ID=" + studentID +
                '}';
    }
}
