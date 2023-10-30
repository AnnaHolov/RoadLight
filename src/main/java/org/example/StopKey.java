package org.example;

public class StopKey extends Thread{
    public void run() {
        try {
            Thread.sleep(200);
            System.out.println("Shutting down ...");
            //some cleaning up code...

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            e.printStackTrace();
        }
    }
}
