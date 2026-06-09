package main.ch04NestedClassesAndLambda.bank;

import java.util.*;

public class BankApp {

    public static void main(String[] args) {
        
        try {
            List<Account> accounts = new ArrayList<>();
            accounts.add(new Savings("Fred", 1000.0));
            accounts.add(new Current("Janet", 1200.0));
            accounts.add(new Current("Barry", 500.0, 200.0));

            Comparator<Account> byDescBalancePreJVM8 = new Comparator<Account>() {
                // Prior to Java 8. 
                @Override
                public int compare(Account a1, Account a2) {
                    return (int) (a2.getBalance() - a1.getBalance());
                }
            };
            // In later versions you can use a lambda instead:
            Comparator<Account> byDescBalancePostJVM8 = (a1, a2) -> (int) (a2.getBalance() - a1.getBalance());


            Collections.sort(accounts, byDescBalancePreJVM8); // sorting method 1
            accounts.sort(byDescBalancePostJVM8); // sorting method 2. both structures analogous
            
            System.out.println(accounts);
            
        } catch (AccountNameException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
