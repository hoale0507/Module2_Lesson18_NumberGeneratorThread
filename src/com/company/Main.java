package com.company;

public class Main {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new NumberGenerator());
        Thread thread2 = new Thread(new NumberGenerator());


        int max = Thread.MAX_PRIORITY;
        int min = Thread.MIN_PRIORITY;
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
//        thread1.setPriority(min);
//        thread2.setPriority(max);
//        System.out.println(thread1.getPriority());
//        System.out.println(thread2.getPriority());
        thread1.start();
        thread2.start();
    }
}
