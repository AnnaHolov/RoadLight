package org.example;


import javafx.scene.paint.Stop;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        while (true) {
            Red red = new Red();
            red.start();
            Thread.sleep(2000);

            Yellow yellow = new Yellow();
            Thread yellowThread = new Thread(yellow);
            yellowThread.start();
            Thread.sleep(2000);

            Green green = new Green();
            green.start();
            Thread.sleep(2000);

            yellowThread = new Thread(yellow);
            yellowThread.start();
            Thread.sleep(1000);

            StopKey stop= new StopKey();
            stop.start();
            Thread.sleep(10000);
        }


    }
}