package com.company.Principles.Inheritance.Multi_Level_Inheritance;

public class Brand extends Laptop{
    String name;

    Brand(String processor,String name){
        super(processor);
        this.name = name;
    }

    Brand(Brand copy){
        super(copy);
        this.name=name;
    }

    Brand(String processor,boolean touchscreen,String name){
        super(processor,touchscreen);
        this.name=name;
    }
}
