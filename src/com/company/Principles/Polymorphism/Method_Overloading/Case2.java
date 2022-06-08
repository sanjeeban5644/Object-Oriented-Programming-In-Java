package com.company.Principles.Polymorphism.Method_Overloading;

public class Case2 {

    void display(String a){
        System.out.println(a);
    }

    void display(float a){
        System.out.println(a);
    }
    /*if integer value was passed the below function would have been called
      with preference.*/
//    void display(int a){
//        System.out.println(a);
//    }
}
