package com.company;

public class FirstThread extends Thread {


    Thread createThread = new Thread(()-> System.out.println("I'm inside runnable"));

    @Override
    public void run() {
        (new Thread(createThread)).start();
    }

}
