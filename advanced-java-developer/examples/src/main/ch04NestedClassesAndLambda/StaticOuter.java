package main.ch04NestedClassesAndLambda;

public class StaticOuter {
    public static void main(String[] args) {
        System.out.println(StaticNested.staticVariable);
        StaticNested nested = new StaticNested();
        System.out.println(nested.nonStaticVariable);
        new StaticOuter().displayStaticVariable();
        
    }
    private void displayStaticVariable(){
        System.out.println(StaticNested.staticVariable);
    }
    public static class StaticNested {
        private String nonStaticVariable = "non-static string";
        private static String staticVariable = "Static string";
    }
}
