package com.company.Principles.Inheritance.Hierarchical_Inheritance;

public class Lion extends Animal{

    String place;

    Lion(String type,float population,String place){
        super(type,population);
        this.place=place;
    }
}
