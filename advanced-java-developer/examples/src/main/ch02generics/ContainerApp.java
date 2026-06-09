package main.ch02generics;
import main.ch00refresher.*;

public class ContainerApp {
    public static void main(String[] args) throws AccountNameException {
        Container<Account> container = new Container<>();
        container.load(new Savings("steve", 100));
        double balance = container.unload().getBalance();
        System.out.println(balance);

        Container<String> container2 = new Container<>();
        container2.load("hello i'm a string");
        System.out.println(container.unload());
    }
}
