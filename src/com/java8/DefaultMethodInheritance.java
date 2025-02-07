package com.java8;

public class DefaultMethodInheritance implements A, B{
    public static void main(String[] args) {
        DefaultMethodInheritance d1 = new DefaultMethodInheritance();
        d1.sayHello();
    }

    public void sayHello() {
        A.super.sayHello();
    }
}

interface A {
    default void sayHello() {
        System.out.println("A says Hello");
    }
}

interface B {
    default void sayHello() {
        System.out.println("B says Hello");
    }
}
