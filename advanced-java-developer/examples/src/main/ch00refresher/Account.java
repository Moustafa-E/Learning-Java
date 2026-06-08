package main.ch00refresher;

public abstract class Account {
    // (default) private - same class
    // protected - same package and subclasses of different packages
    // public - visible to other classes in other packages

    protected String holder;
    private final int id; // a final field can't be changed. Final method can't be overwritten. Final class can't be extended. 
    protected double balance; // want to change this in the subclass Current()
    private static int globalId = 1001;
    // static fields are shared between all instances of the class
    
    // Constructor. Allows you to pass in field values during instatiation (making an object from the class)
    public Account(String holder) throws AccountNameException {
        setHolder(holder);
        id=globalId;
        globalId++;
    }
    // Constructor overloading: Gives options for instatiation.
    public Account(String holder, double balance) throws AccountNameException {
        this(holder);
        this.balance = balance;
        // System.out.println("\n" + toString()); // method from the implicit superclass called Object which all classes inherit. Can be overridden to be more usfeul.
    }

    // Assigns the class's field (this.holder) to the parameter passed in during the function call ( setHolder(holder) ).
    public void setHolder(String holder) throws AccountNameException {

        if (!holder.isEmpty()) {
            this.holder = holder;
        } else {
            throw new AccountNameException("The account holder's name must have at least 1 character");
            // Adding this here means you need to allow every method that calls this to also throw the exception, including other classes and main.
            // That's why you'll see "throw AccountNameException()" in a lot of places. \
            // You can avoid this by containing the methods and instantiations that use this in a try-catch block.
        }
    }

    @Override
    public String toString(){
        return "Holder: " + holder + " id: " + id + " balance: " + balance;
    }

    public abstract void deposit(double amount);

    public abstract void withdraw(double amount) throws AccountPaymentException;

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
