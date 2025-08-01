package Week2.Exercises.Practices.BankingSystem;

public class Customer {
    private String name;
    private String surname;
    private String telNo;
    private String password;
    private String identity;

    private BankAccount[] bankAccounts;

    public Customer(String name, String surname, String password, String identity, String telNo) {
        if(password.length() < 8  && password.length() <=12){
            System.out.println("şifreniz en az 8 hane, en falza 12 hane olmalıdır. ");
        }else {
            this.name = name;
            this.surname = surname;
            this.password = password;
            this.identity = identity;
            this.telNo = telNo;
            bankAccounts = new BankAccount[4];
            System.out.println("kullanıcı oluşturuldu.");
        }

    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
