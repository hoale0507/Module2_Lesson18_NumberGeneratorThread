package com.company;

public class NumberGenerator implements Runnable{
    String name;

    public NumberGenerator() {
    }

    public NumberGenerator(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(this.name + ": i = " + i + ", hashCode = " + this.hashCode());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

//    @Override
//    public int hashCode() {
//        return this.hashCode();
//    }
}
