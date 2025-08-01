package Week2.Exercises.Practices.StudentInformationSystem;

public class Main {
    public static void main (String[] args) {



        Teacher mathteacher = new Teacher("Aksu", "Zeynep", "121212" );
        Teacher pyhsicsteacher = new Teacher("Arslan", "Recep", "131313" );
        Teacher chemisteryteacher = new Teacher("Çelik", "Büşra", "141414" );
        Teacher biologyteacher = new Teacher("Başaran", "Mustafa", "151515" );
        Teacher historyteacher = new Teacher("Yitiz", "Mehmet", "161616" );

        Teacher[] teachers = new Teacher[5];
        teachers[0] = mathteacher;
        teachers[1] = pyhsicsteacher;
        teachers[2] = chemisteryteacher;
        teachers[3] = biologyteacher;
        teachers[4] = historyteacher;




        Course mathcourse =  new Course("Matematik", "1", 15, 50);
        Course pyhsicscourse =  new Course("Fizik", "2", 10, 60);
        Course chemisterycourse =  new Course("Kimya", "3", 12, 70);
        Course biologycourse =  new Course("Biyoloji", "4", 9, 90);
        Course historycourse =  new Course("Kimya", "5", 24, 100);

        Course[] courses = new Course[5];
        courses[0] = mathcourse;
        courses[1] = pyhsicscourse;
        courses[2] = chemisterycourse;
        courses[3] = biologycourse;
        courses[4] = historycourse;

        mathteacher.setCourse(mathcourse);
        pyhsicsteacher.setCourse(pyhsicscourse);
        chemisteryteacher.setCourse(chemisterycourse);
        biologyteacher.setCourse(biologycourse);
        historyteacher.setCourse(historycourse);

        mathcourse.setTeacher(mathteacher);
        pyhsicscourse.setTeacher(pyhsicsteacher);
        chemisterycourse.setTeacher(chemisteryteacher);
        biologycourse.setTeacher(biologyteacher);
        historycourse.setTeacher(historyteacher);

        Student student1 = new Student("Melek", "Alibaşoğlu", 2002, 7);
        Student student2 = new Student("Emir", "Yanık", 2003, 8);
        Student student3 = new Student("Batuhan", "Bulut", 2001, 9);
        Student student4 = new Student("Beyza", "Balaban", 2000, 5);

        Student[] students = new Student[4];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;
        students[3] = student4;

        student1.setCourse(courses);
        student2.setCourse(courses);
        student3.setCourse(courses);
        student4.setCourse(courses);

        for (Teacher teacher : teachers) {
            System.out.println(teacher);
        }

        for (Course course : courses) {
            System.out.println(course);
        }

        for (Student student : students) {
            System.out.println(student);
        }

        student1.addCourse(mathcourse, 0);
        student1.addCourse(pyhsicscourse, 1);
        student1.addCourse(historycourse, 2);
        student1.addCourse(biologycourse, 3);
        student1.addCourse(chemisterycourse, 4);








    }
}
