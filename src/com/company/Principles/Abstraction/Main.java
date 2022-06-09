package com.company.Principles.Abstraction;

public class Main {
    public static void main(String[] args) {
        Petrol car1 = new Petrol();
        Diesel car2 = new Diesel();
        Electric car3 = new Electric();
        car1.engine();
        car2.engine();
        car3.engine();
    }
}
