package Week2.Exercises.Practices.BankingSystem;

public class BankAccount {
    private String accountNumber;
    private double balance;

    private CurrencyType currencyType;


    public BankAccount() {

        if(balance<0) {
            System.out.println("- bakiye olusturamazsınız.");
        }
        this.accountNumber = accountNumber;
        this.currencyType = currencyType;
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double amount, CurrencyType currencyType) {
    }


    public void deposit(double amount) {
        if(amount>0) {
            balance += amount;
            System.out.println(amount + "  " + currencyType + "yatırıldı. Yeni bakiyeniz = " + balance + currencyType.getSymbol());

        }else {
            System.out.println("geçersiz tutar");
        }
    }
}
