package com.technosignialive.january.file_handling;


// volatile example
public class MyThread extends Thread{
    public volatile boolean  isRunning =true;

    public void run() {
        while(isRunning) {
            System.out.println("Thread started....");
        }
        System.out.println("Thread Stop.....");
    }

    public void stopThread() {
        isRunning =false;
    }

    public static void main(String args[]) throws InterruptedException {
        MyThread t1 = new MyThread();
        t1.start();

        Thread.sleep(1000); // 1 sec
        t1.stopThread();
    }

}