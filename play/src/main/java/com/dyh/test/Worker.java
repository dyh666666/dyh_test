package com.dyh.test;

public class Worker {
    private boolean done = false;

    public void setDone(boolean done) {
        this.done = done;
    }

    public void work() {
        while (!done) {

        }
    }

    public static void main(String[] args) throws InterruptedException {
        final Worker worker = new Worker();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                worker.work();
            }
        });
        thread1.start();

        Thread.sleep(500l);

        final Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("set true");
                worker.setDone(true);
            }
        });
        thread.start();
    }
}