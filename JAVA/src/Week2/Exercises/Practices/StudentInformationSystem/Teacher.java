package Week2.Exercises.Practices.StudentInformationSystem;

public class Teacher {
    private String name;
    private String surname;
    private String teacherNo;
    private Course course;

    public Teacher(String surname, String name, String teacherNo) {
        this.surname = surname;
        this.name = name;
        this.teacherNo = teacherNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getTeacherNo() {
        return teacherNo;
    }

    public void setTeacherNo(String teacherNo) {
        this.teacherNo = teacherNo;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", teacherNo='" + teacherNo + '\'' +
                ", course=" + course +
                '}';
    }
}
