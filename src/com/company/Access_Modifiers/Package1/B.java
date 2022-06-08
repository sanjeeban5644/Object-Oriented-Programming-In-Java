package com.company.Access_Modifiers.Package1;

public class B extends A{
    String subject;

    B(int roll,float marks,String dept,String subject){
        super(roll,marks,dept);
        this.subject=subject;
    }
}
