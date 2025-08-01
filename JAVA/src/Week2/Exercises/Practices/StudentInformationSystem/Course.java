package Week2.Exercises.Practices.StudentInformationSystem;

public class Course {
    private String name;
    private String code;
    private int hoursOfWeek;
    private Teacher teacher;
    private int note;


    public Course(String name,String code, int hoursOfWeek, int note ) {
        this.name = name;
        this.code = code;
        this.hoursOfWeek = hoursOfWeek;
        this.note = note;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHoursOfWeek() {
        return hoursOfWeek;
    }

    public void setHoursOfWeek(int hoursOfWeek) {
        this.hoursOfWeek = hoursOfWeek;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", hoursOfWeek=" + hoursOfWeek +
                ", note=" + note +
                '}';
    }
}
