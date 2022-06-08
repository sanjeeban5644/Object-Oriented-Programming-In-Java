package com.company.Access_Modifiers.Package2;

import com.company.Access_Modifiers.Package1.A;

public class C extends A {
    int regno;

    public C(int roll, float marks, int regno){
        super(roll,marks);
        this.regno=regno;
    }


}
