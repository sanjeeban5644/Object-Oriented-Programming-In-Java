package com.company.Principles.Inheritance.Multi_Level_Inheritance;

public class Main {
    public static void main(String[] args) {
        Laptop l1 = new Laptop("intel");
        Brand hp = new Brand("amd","hp");
        Brand lenovo = new Brand(hp);
        Origin apple = new Origin("amd",false,"apple","china");
        Origin dell = new Origin(apple);
        Brand samsung = new Brand("intel",true,"samsung");
        System.out.println(l1.processor);
        System.out.println(hp.processor+","+hp.name);
        System.out.println(apple.processor+","+apple.touchscreen+","+apple.name+","+apple.country);
        System.out.println(dell.processor);
        System.out.println(samsung.processor+","+samsung.touchscreen+","+samsung.name);
    }
}
