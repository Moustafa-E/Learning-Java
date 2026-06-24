package main.ch00refresher;

public class Savings extends Account implements InterestAssociated {

    private static final double SAVINGS_LIMIT = 10_000.0;
    public static final double INTEREST_RATE = 0.05;

    public Savings(String holder) throws AccountNameException {
        super(holder);
    }

    public Savings(String holder, double balance) throws AccountNameException {
        super(holder, balance);
    }

    @Override
    public void deposit(double amount) {
        if (balance +amount <= SAVINGS_LIMIT) {
            balance += amount;
        } else {
            System.out.println("Savings limit exceeded");
        }
    }

    @Override
    public void withdraw(double amount) throws AccountPaymentException {
        if (balance >= amount) {
            balance -= amount;
        } else {
            throw new AccountPaymentException("insufficient funds", amount);
        }
    }

    public static double getInterestRate() {
        return INTEREST_RATE;
    }

    @Override
    public void addInterest() {
        double interest = balance * INTEREST_RATE;
        deposit(interest);
    }
    
}
