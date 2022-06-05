package com.company.Principles.Inheritance.Single_Level_Inheritance;

public class Smartphone {
    String os;
    int battery;
    boolean amoled;

    Smartphone(String os,int battery,boolean amoled){
        this.os = os;
        this.battery = battery;
        this.amoled = amoled;
    }

    Smartphone(Smartphone copy){
        this.os = copy.os;
        this.battery = copy.battery;
        this.amoled = copy.amoled;
    }

}
