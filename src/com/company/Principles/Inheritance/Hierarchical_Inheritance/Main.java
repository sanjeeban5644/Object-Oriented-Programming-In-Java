package com.company.Principles.Inheritance.Hierarchical_Inheritance;

public class Main {

    public static void main(String[] args) {

        Lion l = new Lion("carnivore",500f,"africa");
        Deer d = new Deer("herbivore",1000f,"russia");
        Human h = new Human("omnivore",900000f,"earth");
        System.out.println(l.type+","+l.population+","+l.place);
        System.out.println(d.type+","+d.population+","+d.place);
        System.out.println(h.type+","+h.population+","+h.place);
    }

}
