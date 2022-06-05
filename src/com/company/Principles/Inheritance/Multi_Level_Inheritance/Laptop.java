package com.company.Principles.Inheritance.Multi_Level_Inheritance;

public class Laptop {
    String processor;
    boolean touchscreen;
    boolean ssd;

    Laptop(Laptop copy){
        this.processor=copy.processor;
        this.touchscreen=copy.touchscreen;
        this.ssd=copy.ssd;
    }

    Laptop(String processor){
        this.processor=processor;
    }

    Laptop(String processor,boolean touchscreen){
        this.processor=processor;
        this.touchscreen=touchscreen;
    }
}
