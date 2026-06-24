package main.ch00refresher;

public class BankApp {

    public static void main(String[] args) {
    // static means it'll be loaded into memory first. 
    // Trying to call a non-static function in a static class won't work because the method wouldn't have been loaded into memory. (CHECK)
        try {

            // "new" creates a pointer which references something else. a1 is a pointer to another object stored somewhere else.
            Account a1 = new Savings("Omar");
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

            Account[] accountList = {a1, a2, new Current("George", 100, 300)};

            for (Account account : accountList) {
                account.withdraw(100);
                account.deposit(200);
                
                if (account instanceof InterestAssociated){ // really should be saying instanceof Savings() but since that implements the interface it's fine. 
                    ((InterestAssociated) account).addInterest();
                    // compiler can't assume it'll be the correct type (InterestAssociated or Savings()). So we tell it to override behaviour if class matches. 
                    // InterestAssociated and Savings are interchangeable here. We cast to the interface so we don't have to remember which class implements it. 
                }
                System.out.println(account);
            }
        } catch (AccountNameException | NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (AccountPaymentException e) {
            System.out.println(e);
        } catch (Exception e) {
            e.printStackTrace();
            // This is a "catch-all". Put this first, and the first one would never be reached. So put the most restrictive conditions first in try-catches.
        }
    }
}
