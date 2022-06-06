package com.company.Principles.Polymorphism;

/*
Method Overloading is the Process in which the class has two or more methods
with the same name, that are solely distinguishable by the argument nos., type
or order.

Case 1 :
    Changing the number of Parameters.
Case 2 :
    Changing the Datatype of Parameters.
Case 3 :
    Changing Sequence of Parameters.
 */

public class Overloading {
    public static void main(String[] args) {
        Case1 obj1 = new Case1();
        System.out.println(obj1.sum(5,6));
        Case1 obj2 = new Case1();
        System.out.println(obj2.sum(1,7,9));

        Case2 obj3 = new Case2();
        obj3.display("hello");
        Case2 obj4 = new Case2();
        obj4.display(43);

        Case3 obj5 = new Case3();
        obj5.display("hello",43);
        Case3 obj6 = new Case3();
        obj6.display(43,"hello");
    }
}
