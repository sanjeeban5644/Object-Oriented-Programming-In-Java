package com.company.Interfaces_example2;

public class BosePlayer implements Media{

    @Override
    public void start(){
        System.out.println("Music Starts");
    }

    @Override
    public void stop(){
        System.out.println("Music Stops");
    }
}
