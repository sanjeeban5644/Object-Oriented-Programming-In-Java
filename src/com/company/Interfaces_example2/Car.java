package com.company.Interfaces_example2;

public class Car implements Engine,Brake,Media{

    @Override
    public void brake(){
        System.out.println("Brakes Applied");
    }

    @Override
    public void start(){
        System.out.println("Engine started");
    }

    @Override
    public void stop(){
        System.out.println("Engine stopped");
    }

    @Override
    public void acc(){
        System.out.println("Car accelerated");
    }

}
