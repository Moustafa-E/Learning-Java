package main.ch00refresher;

public class BankApp {

    public static void main(String[] args) {
    // static means it'll be loaded into memory first. 
    // Trying to call a non-static function in a static class won't work because the method wouldn't have been loaded into memory. (CHECK)

        // "new" creates a pointer which references something else. a1 is a pointer to another object stored somewhere else.
        Account a1 = new Account("Omar");
        Account a2 = new Current("Fred", 500, 200); // Current() inherits the fields & methods of Account(). It's a type of account. 
        // a2.getOdLimit() wouldn't work because a2 is set to Account() which doesn't have access to Current()'s methods.

        // data type assumptions are happening here.
        a1.deposit(100.0);
        a1.withdraw(800);
        a2.withdraw(800);

        System.out.println(
            a1.getHolder() + ", balance: " + a1.getBalance()
        );
        System.out.println(
            a2.getHolder() + ", balance: " + a2.getBalance()
        );

        System.out.println(
            Account.getGlobalId()
        );

        Account a3 = a2; // Both objects hold a pointer to the object created in a2. Both totally equal. 
        Account a4 = new Current("Fred", 500, 200); // same as a2
        System.out.println("a2 == a3? " + (a2 == a3));
        System.out.println("a3.equals(a4) " + a3.equals(a4));
        // .equals() is overridden to compare fields within a class for more utility. It would otherwise return false.

    }
}
