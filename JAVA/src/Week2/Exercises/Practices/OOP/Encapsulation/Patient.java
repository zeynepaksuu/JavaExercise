package Week2.Exercises.Practices.OOP.Encapsulation;

public class Patient {
    private String name;
    private String surname;
    private int age;
    private String identityNumber;

    public Patient(String identityNumber) {
        setIdentityNumber(identityNumber);
        this.identityNumber = identityNumber;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        if(identityNumber.length() != 11) {
            System.out.println("yanlıs girdiniz");
        }else {
            System.out.println("dogru girdiniz.");
            this.identityNumber = identityNumber;
        }

    }
}
