// INHERITANCE

package main.ch04NestedClassesAndLambda.bank;

import java.util.Objects;

public class Current extends Account {
    // this is a subclass. Confusing because it's technically bigger than the parent because it inherits methods and implements new ones. 

    private double odLimit; // overdraft limit

    // Constructors
    public Current(String holder) throws AccountNameException {
        super(holder); // grab the holder field from the parent class, Account()
    }
    public Current(String holder, double balance) throws AccountNameException {
        super(holder, balance);
    }
    public Current(String holder, double balance, double odLimit) throws AccountNameException{
        super(holder, balance);
        setOdLimit(odLimit);
    }

    // Getters / Setters
    public double getOdLimit() {
        return odLimit;
    }
    public void setOdLimit(double odLimit) {
        this.odLimit = odLimit;
    }

    // General Methods

    // Using the same method signature (name, parameters, return type) as the super class requires @Override. That'll change the behaviour of the compiler to use this def for this subclass.
    @Override
    public void withdraw(double amount) throws AccountPaymentException {
        if (balance + odLimit >= amount) {
            balance -= amount;
        } else {
            throw new AccountPaymentException("overdraft limit exceeded", amount);
        }
    }
    @Override
    public void deposit(double amount) {
        balance += amount;
    }

    @Override
    public String toString(){
        return super.toString() + " overdraft: " + odLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;
        return Double.compare(balance, account.balance) == 0 && Objects.equals(holder, account.holder);
        // ^ Double is a wrapper class of double. It contains methods you can use on the variable. 
    }

    @Override
    public int hashCode() {
        // groups related data together.
        int result = Objects.hashCode(holder);
        result = 31 * result + Double.hashCode(balance); // We're forming a hashcode based on the field values in the class. 
        return result;
    }


}