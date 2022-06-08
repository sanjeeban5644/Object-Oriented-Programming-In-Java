package com.company.Principles.Polymorphism.Method_Overloading;

public class Case3 {
    //<<This is incorrect>>
//    void display(String a, int b){
//
//    }
//    void display(String b,int a){
//
//    }

    void display(String a,int b){
        System.out.println(a+","+b);
    }
    void display(int a,String b){
        System.out.println(a+","+b);
    }
}
