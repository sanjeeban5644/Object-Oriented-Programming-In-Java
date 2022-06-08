package com.company.Access_Modifiers.Package1;

public class B extends A{

    private void display4(){
        System.out.println("I am private in B");
    }

    void display5(){
        System.out.println("I am default in B");
    }

    protected void display6(){
        System.out.println("I am protected in B");
    }
}
