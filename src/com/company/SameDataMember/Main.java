package com.company.SameDataMember;

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        Parent obj2 = new Parent();

        System.out.println(obj1.DATA);
        System.out.println(obj1.NAME);

        obj1.display();
        obj2.display();
    }
}
