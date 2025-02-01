package com.java8;

public interface FunctionalInterfaceChild extends FunctionalInterfaceParent{
    default void sayBye() {
        // can have any number of static and default methods
    }
    public static void sayYes() {

    }
    public void sayHello(); // can have the same parent method
}
