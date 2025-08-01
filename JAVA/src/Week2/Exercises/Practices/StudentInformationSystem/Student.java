package Week2.Exercises.Practices.StudentInformationSystem;

import java.time.LocalDate;
import java.util.Arrays;

public class Student {
    private String name;
    private String surname;
    private LocalDate birthyear;
    private int studentNo;

    private Course [] courses = new Course[5];

    public Student(String name, String surname, LocalDate birthyear, int studentNo) {
        this.name = name;
        this.surname = surname;
        this.birthyear = birthyear;
        this.studentNo = studentNo;
    }

    public void addCourse(Course course, int index) {
        if(index>=0 && index<= courses.length) {
            courses[index] = course;
            System.out.println("ders basarıyla eklendi");
        }else {
            System.out.println("max 5 ders ekleyebilirsiniz.");
        }

    }




    public Student(String melek, String alibaşoğlu, int i, int studentNo) {
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentNo() {
        return studentNo;
    }

    public void setStudentNo(int studentNo) {
        this.studentNo = studentNo;
    }

    public LocalDate getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(LocalDate birthyear) {
        this.birthyear = birthyear;
    }

    @Override
    public String toString() {
        return "Student{" +
                "birthyear=" + birthyear +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", studentNo=" + studentNo +
                '}';
    }

    public void setCourse(Course[] courses) {
    }
}
