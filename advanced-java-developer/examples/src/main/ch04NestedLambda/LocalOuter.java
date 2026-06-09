package main.ch04NestedLambda;

public class LocalOuter {
    private int length = 20;
    public static void main(String[] args) {
        LocalOuter outer = new LocalOuter();
        outer.calc();
    }
    public void calc() {
        final int width = 30;
    
        class LocalInner { // a class inside a method in case you're feeling cursed.
            public void multiply() {
                System.out.println(length * width);
            }
        }

        LocalInner inner = new LocalInner();
        inner.multiply();
    }
}
