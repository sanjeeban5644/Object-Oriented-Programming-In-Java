package com.company.Access_Modifiers.Package1;

import com.company.Access_Modifiers.Package2.C;
import com.company.Access_Modifiers.Package2.D;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        C obj3 = new C();
        D obj4 = new D();


        obj1.display2();
        obj1.display3();
        obj2.display5();
        obj2.display6();
        obj3.display3();
        obj4.display3();
        obj4.display11();

    }
}
