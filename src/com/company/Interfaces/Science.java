package com.company.Interfaces;

public class Science implements Physics,Chemistry,Biology{
    @Override
    public void physics() {
        System.out.println("Physics");
    }

    @Override
    public void test() {
        System.out.println("Test");
    }

    @Override
    public void biology() {
        System.out.println("Biology");
    }

    @Override
    public void chemistry() {
        System.out.println("Chemistry");
    }
}
