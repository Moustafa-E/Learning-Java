package main.ch02generics;

public class GenericMethod {
    public static void main(String[] args) {
        GenericMethod gm = new GenericMethod();
        String result = gm.echo("Hello"); //type is inferred. Could also define using <String> to be explicit.
        System.out.println(result);
        
    }
    // <parameter type> return type (parameters)
    private <T> T echo(T t) {
        System.out.println(t);
        return t;
    }
}
