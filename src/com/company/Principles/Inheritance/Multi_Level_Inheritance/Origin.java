package com.company.Principles.Inheritance.Multi_Level_Inheritance;

public class Origin extends Brand{
    String country;

    Origin(Origin copy){
        super(copy);
        this.country=copy.country;
    }

    Origin(String processor,boolean touchscreen,String name,String country){
        super(processor,touchscreen,name);
        this.country=country;
    }

}
