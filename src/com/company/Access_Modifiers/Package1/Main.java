package com.company.Access_Modifiers.Package1;

import com.company.Access_Modifiers.Package2.C;
import com.company.Access_Modifiers.Package2.D;
import com.company.Access_Modifiers.Package2.E;

public class Main {
    public static void main(String[] args) {
        A obj1 = new A(43,9.2f,"CSE");
        B obj2 = new B(43,9.2f,"CSE","Networks");
        C obj3 = new C(43,9.2f,006);
        D obj4 = new D(43,9.2f,"DBMS");
        E obj5 = new E(true);
        obj1.setName("Sanjeeban");
        System.out.println(obj1.getName());
    }
}
