package com.company.Principles.Inheritance.Hierarchical_Inheritance;

public class Human extends Animal{

    String place;

    Human(String type,float population,String place){
        super(type,population);
        this.place = place;
    }
}
