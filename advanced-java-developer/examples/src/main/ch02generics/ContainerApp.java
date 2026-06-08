package main.ch02generics;
import main.ch00refresher.*;

public class ContainerApp {
    public static void main(String[] args) throws AccountNameException {
        GenericContainer<Account> container = new GenericContainer<>();
        container.load(new Savings("steve", 100));
        double balance = container.unload().getBalance();
        System.out.println(balance);

        GenericContainer<String> container2 = new GenericContainer<>();
        container2.load("hello i'm a string");
        System.out.println(container.unload());
    }
}
