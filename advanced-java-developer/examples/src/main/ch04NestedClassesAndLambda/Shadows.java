package main.ch04NestedClassesAndLambda;

public class Shadows {

    String greeting =  "Hello";
    public static void main(String[] args) {
        Shadows shadows = new Shadows();
        Inner inner = shadows.new Inner();
        inner.greet("hi");
        
    }
    class Inner {
        String greeting = "Hola";

        void greet(String greeting) {
            System.out.println("Method says: " + greeting);
            System.out.println("Inner Class says: " + this.greeting);
            System.out.println("Outer Class says: " + Shadows.this.greeting);
        }
    }

}
