package com.company.Principles.Inheritance.Hierarchical_Inheritance;

public class Deer extends Animal{

    String place;

    Deer(String type,float population,String place){
        super(type,population);
        this.place = place;
    }
}
