package com.company.Access_Modifiers.Package2;

import com.company.Access_Modifiers.Package1.A;

public class D extends C {

    void display9(){
        System.out.println("I am default in D");
    }

    protected void display10(){
        System.out.println("I am protected in D");
    }

    public void display11(){
        System.out.println("I am public in D");
    }

}