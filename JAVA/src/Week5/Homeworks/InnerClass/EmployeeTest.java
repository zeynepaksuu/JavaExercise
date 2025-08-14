package Week5.Homeworks.InnerClass;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Zeynep", "Aksu", "5551234567", "zeynep@gmail.com");
        Employee emp2 = new Employee("Ahmet", "Yılmaz", "5559876543", "ahmet@gmail.com");

        emp1.display();
        System.out.println();
        emp2.display();
    }
}
