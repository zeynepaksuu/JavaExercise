package Week2.Exercises.Practices.OOP.Inheritance.Example2;

public class AccountTest {
    public static void main (String[] args) {

        SavingAccount savingAccount = new SavingAccount(500, 20000);
        //savingAccount.setInterestRate(20000);
        InvestingAccount investingAccount = new InvestingAccount(3000, "enflasyon");


    }
}
