package com.company.Interfaces_example2;

public class MyCar {
    private Engine engine1 = new ElectricEngine();
    private Brake b1 = new MRFBrakes();
    private Media m1 = new BosePlayer();

    public void start(){
        engine1.start();
    }
    public void stop(){
        engine1.stop();
    }
    public void acc(){
        engine1.acc();
    }
    public void brake(){
        b1.brake();
    }
    public void startmusic(){
        m1.start();
    }
    public void stopmusic(){
        m1.stop();
    }

}
