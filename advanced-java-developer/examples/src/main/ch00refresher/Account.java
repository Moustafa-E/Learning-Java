package main.ch00refresher;

public class Account {
    // (default) private - same class
    // protected - same package and subclasses of different packages
    // public - visible to other classes in other packages

    protected String holder;
    private final int id; // a final field can't be changed. Final method can't be overwritten. Final class can't be extended. 
    protected double balance; // want to change this in the subclass Current()
    private static int globalId = 1001;
    // static fields are shared between all instances of the class
    
    // Constructor. Allows you to pass in field values during instatiation (making an object from the class)
    public Account(String holder) {
        setHolder(holder);
        id=globalId;
        globalId++;
    }
    // Constructor overloading: Gives options for instatiation.
    public Account(String holder, double balance) {
        this(holder);
        this.balance = balance;
        System.out.println("\n" + toString()); // method from the implicit superclass called Object which all classes inherit. Can be overridden to be more usfeul.
    }

    // Assigns the class's field (this.holder) to the parameter passed in during the function call ( setHolder(holder) ).
    public void setHolder(String holder) {

        if (!holder.isEmpty()) {
            this.holder = holder;
        } else {
            System.out.println("Holder must have at least 1 character");
        }
    }

    @Override
    public String toString(){
        return "Holder: " + holder + " id: " + id + " balance: " + balance;
    }

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("insufficient funds");
        }
    }

    public String getHolder() {
        return holder;
    }
    public int getId() {
        return id;
    }
    public double getBalance() {
        return balance;
    }

    public static int getGlobalId() {
        return globalId;
    }
}
