package Week2.Homeworks.SalaryCalculation;

import java.sql.SQLOutput;

public class Employee {

    public String name ;  //isim soyisim
    public int salary ; // maaş
    public int workHours ; //haftada kaç saat
    public int hireYear ; //işe başlama yılı
    int currentYear = 2021;

    public Employee(String name, int salary,  int workHours, int hireYear) {
        this.salary = salary;
        this.name = name;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    public double tax() {
        if ( salary < 1000 ) {
            return 0;
        }
        return salary * 0.03;
    }

    public double bonus() {
        if(workHours < 40) {
            return 0;
        }
        return (workHours - 40) * 30 ;
    }

    public double raiseSalary () {
        if((currentYear-hireYear) < 10) {
            return salary * 0.05;
        }
        else if((currentYear-hireYear) > 9 && (currentYear-hireYear) < 20) {
            return salary * 0.1;
        }
        else {
            return salary * 0.15;
        }
    }

    @Override
    public String toString() {
        double tax = tax();
        double bonus = bonus();
        double raise = raiseSalary();

        return  "Name: " + name +
                "\nSalary: " + salary +
                "\nWork Hours: " + workHours +
                "\nHire Year: " + hireYear +
                "\nTax: " + tax +
                "\nBonus: " + bonus +
                "\nSalary Increase: " + raise ;
    }


}
