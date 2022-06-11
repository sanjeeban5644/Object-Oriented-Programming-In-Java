package com.company.Interfaces_example2;

public class SonyPlayer implements Media{

    @Override
    public void start(){
        System.out.println("Sony Player starts");
    }

    @Override
    public void stop(){
        System.out.println("Sony Player stops");
    }
}
