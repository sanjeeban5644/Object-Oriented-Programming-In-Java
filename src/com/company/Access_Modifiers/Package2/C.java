package com.company.Access_Modifiers.Package2;
import com.company.Access_Modifiers.Package1.A;

public class C extends A {

    void display7(){
        System.out.println("I am default in C");
    }

    protected void display8(){
        System.out.println("I am protected in C");
    }

    public static void main(String[] args) {
        C obj = new C();
        obj.display3();
    }
}
