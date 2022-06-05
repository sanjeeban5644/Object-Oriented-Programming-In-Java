package com.company.Principles.Inheritance.Single_Level_Inheritance;

public class Main {
    public static void main(String[] args) {
        Smartphone m31 = new Smartphone("android",5000,true);
        Processor iphone11 = new Processor("ios",3000,true,"bionic");
        Smartphone nord2 = new Processor("android",4500,true,"mediatek");
        Processor iphone12 = new Processor(iphone11);
        System.out.println((nord2.amoled));
        System.out.println(iphone12.processor);
    }
}
