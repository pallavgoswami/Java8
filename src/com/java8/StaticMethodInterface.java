package com.java8;

public class StaticMethodInterface implements Ex {
    public static void main(String[] args) {
        StaticMethodInterface s1 = new StaticMethodInterface();
        s1.sayBye(); // can call the default method inside interface.
        Ex.sayHello(); // can only call the static method inside interface using its name.
    }
}

interface Ex {
    static void sayHello() {
        System.out.println("Hello !");
    }
    default void sayBye() {
        System.out.println("Bye !");
    }
}
