package com.company.Access_Modifiers.Package2;

import com.company.Access_Modifiers.Package1.A;

public class D extends A{
    String optional;

    public D(int roll,float marks,String optional){
        super(roll,marks);
        this.optional=optional;
    }

}