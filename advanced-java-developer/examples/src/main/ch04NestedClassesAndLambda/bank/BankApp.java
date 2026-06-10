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
            System.out.println("Sorted pre JVM8: " + accounts);
            
            accounts.sort(byDescBalancePostJVM8); // sorting method 2. both structures analogous
            System.out.println("Sorted post JVM8: " + accounts);

            Comparator<Account> byHolder = Comparator.comparing(account -> account.getHolder());
            /*
            Docs: comparing(Function<? super T,? extends U> keyExtractor, Comparator<? super U> keyComparator) : Comparator<T>              
            - Seeing "Function" in here means it takes a function as an argument.
            - More explicitly it's asking you to implement a functional interface. Can do with lambda function.
            */
           System.out.println("Sorted via Comparator.comparing(): " + accounts);

           System.out.println("\nSorted via .forEach(): ");
           accounts.forEach(a -> {
            try {
                a.withdraw(50.0);
            } catch (AccountPaymentException e) {
                System.out.println(e.getMessage());
            }
            System.out.println(a);
           });

           System.out.println("\nSorted via .forEach() using method reference");
           accounts.forEach(System.out::println);
           // arguments for println() are passed in automatically
            
        } catch (AccountNameException | NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
