package main.ch00refresher;

@FunctionalInterface // stops you from adding another abstract method. Useful if you want your interface to "back" lambda expressions. 
public interface InterestAssociated {
    // An Abstract class that only contains abstract methods. Normal abstract classes can contain implemented (concrete) methods too (pre java 8)
    // Post java 8, interfaces can also contain concrete (if marked as "default") & static methods.
    // Useful because classes can only extend one other class, whereas they can implement many interfaces.
    void addInterest();
}
