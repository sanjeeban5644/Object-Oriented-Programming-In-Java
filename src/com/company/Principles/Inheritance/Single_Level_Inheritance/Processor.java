package com.company.Principles.Inheritance.Single_Level_Inheritance;

public class Processor extends Smartphone{

    String processor;

    Processor(String os, int battery , boolean amoled, String processor){
        super(os,battery,amoled);
        this.processor = processor;
    }

    Processor(Processor copy){
        super(copy);
        this.processor= copy.processor;
    }

}
