package main.ch00refresher;

public class AccountPaymentException extends Exception {
    private double amount;
    public AccountPaymentException(String message, double amount){
        super(message);
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
    
}
