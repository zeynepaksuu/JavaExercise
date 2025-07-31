package Week2.Exercises.Practices.OOP.Inheritance.Example2;

public class InvestingAccount extends Account {
    private String riskFactor;

    public String getRiskFactor() {
        return riskFactor;
    }

    public void setRiskFactor(String riskFactor) {
        this.riskFactor = riskFactor;
    }

    public InvestingAccount(double balance, String riskFactor) {
        super(balance);
        this.riskFactor = riskFactor;
    }
}
