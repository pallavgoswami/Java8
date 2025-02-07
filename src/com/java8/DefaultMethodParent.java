package com.java8;

interface DefaultMethodParent {
    default void sayHello() {
        System.out.println("Hello");
    }
}

class DefaultMethodChild implements DefaultMethodParent {
    public void sayHello() {
        System.out.println("Child says hello");
    }
}

class MyClass {
    public static void main(String[] args) {
        DefaultMethodParent p = new DefaultMethodChild();
        p.sayHello();
    }
}

//    Upcasting allows a subclass object to be referenced by a superclass type.
//    Method Overriding & Polymorphism ensure that the overridden method in the child class is called.
//    Default methods in interfaces can be overridden in implementing classes.
