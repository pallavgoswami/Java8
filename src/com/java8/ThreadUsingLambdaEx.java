package com.java8;

public interface ThreadUsingLambdaEx {
    public static void main(String[] args) {
        Runnable runnable = () -> { // Thread Definition through Lambda Expression
            for (int i = 1; i <= 10; i++) {
                System.out.println("Hello" + i);
            }
        };
        Thread childThread = new Thread(runnable); // implementation class of runnable interface inside constructor
        childThread.run();
    }
}
