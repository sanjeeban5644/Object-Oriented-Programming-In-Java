package com.company.Interfaces_example2;

public class YourCar {
    private Engine e2 = new PowerEngine();
    private Brake b2 = new CeatBrakes();
    private Media m2 = new SonyPlayer();

    public void startengine(){
        e2.start();
    }
    public void stopengine(){
        e2.stop();
    }
    public void acc(){
        e2.acc();
    }
    public void brake(){
        b2.brake();
    }
    public void startmusic(){
        m2.start();
    }
    public void stopmusic(){
        m2.stop();
    }

}
