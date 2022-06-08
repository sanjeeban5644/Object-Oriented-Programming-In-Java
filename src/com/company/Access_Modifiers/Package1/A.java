package com.company.Access_Modifiers.Package1;

public class A {
    private String name;
    protected int roll;
    public float marks;
    String dept;

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    A(int roll,float marks,String dept){
        this.roll = roll;
        this.marks=marks;
        this.dept=dept;
    }
    public A(int roll,float marks){
        this.roll = roll;
        this.marks=marks;
    }

    public A(float marks){
        this.marks=marks;
    }

}