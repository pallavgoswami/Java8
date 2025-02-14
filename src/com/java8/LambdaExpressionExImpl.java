package com.java8;

public class LambdaExpressionExImpl {
    public static void main(String[] args) {
        LambdaExpressionEx ex = () -> "Software Engineer";
        System.out.println(ex.getName());
        LambdaExpressionEx ex1 = () -> "Editor";
        System.out.println(ex1.getName());
    }
}
