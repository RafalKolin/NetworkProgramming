package com.company;

public class MainThread extends Thread{
    public static void main(String[] args) {
        FirstThread firstThread = new FirstThread();

        System.out.println("start");

        firstThread.createThread.start();
        if (firstThread.createThread.isAlive()) {
            System.out.println("I'm alive");
        } else {
            System.out.println("I'm died");
        }

        try {
            firstThread.createThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("stop");

    }
}
