package com.company.Interfaces_example2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        Engine engine = new Car();
        engine.acc();
        Brake brake = new Car();
        brake.brake();
        //Problem arises here
        Media media = new Car();
        media.stop();    //Here the engine stops, whearas the media should have stopped.
        /* To solve this problem, we will implement different classes from a single
        interface and then combine them in another class */
        //System.out.println();
        System.out.println("--MY Car--");
        //System.out.println();
        MyCar bmw = new MyCar();
        bmw.start();
        bmw.acc();
        bmw.startmusic();
        bmw.brake();
        bmw.stopmusic();
        bmw.stop();




    }
}
