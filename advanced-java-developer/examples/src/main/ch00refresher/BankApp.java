package main.ch00refresher;

public class BankApp {

    public static void main(String[] args) {
    // static means it'll be loaded into memory first. 
    // Trying to call a non-static function in a static class won't work because the method wouldn't have been loaded into memory. (CHECK)

        // "new" creates a pointer which references something else. a1 is a pointer to another object stored somewhere else.
        Account a1 = new Account("Omar");
        Account a2 = new Account("Fred", 500);

        // data type assumptions are happening here.
        a1.deposit(100.0);
        a1.withdraw(200.0);

        System.out.println(
            a1.getHolder() + ", balance: " + a1.getBalance()
        );
        System.out.println(
            a2.getHolder() + ", balance: " + a2.getBalance()
        );
    }
}
