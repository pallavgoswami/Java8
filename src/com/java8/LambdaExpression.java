package com.java8;

public class LambdaExpression {
    private int getStringLength(String str) {
        return str.length();
    }
//    (String str) -> {return str.length()};

    private void add(int a, int b) {
        System.out.println(a + b);
    }
//    (int a , int b) -> {System.out.println(a + b);}
//    Type inference
//    (a, b) -> System.out.println(a + b);
}


