package com.technosignialive.november.multithreading;

public class MyThread extends Thread {
    public void run() {
        // Running state
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000); // Waiting state
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Thread started..." + Thread.currentThread().getId());
        }
    } // Dead state

    public static void main(String[] args) throws InterruptedException {
        MyThread mt1 = new MyThread();
        Thread t1 = new Thread(mt1);
        t1.start();
        t1.join();

        MyThread mt2 = new MyThread();
        Thread t2 = new Thread(mt2);
        t2.start();

        int a = 10 / 0;
    }
}
 // extending Thread class
// implementing Runnable interface