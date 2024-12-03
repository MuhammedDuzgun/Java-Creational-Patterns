package com.muhammed;

public class Main {
    public static void main(String[] args) {

        PrototypeExample prototypeExample = new PrototypeExample("a","b");
        System.out.println(prototypeExample.getField1());
        System.out.println(prototypeExample.getField2());

        System.out.println("-----------------------------------------------------");

        PrototypeExample prototypeExample2 = prototypeExample.clone();
        prototypeExample2.setField1("c");
        prototypeExample2.setField2("d");
        System.out.println(prototypeExample2.getField1());
        System.out.println(prototypeExample2.getField2());


    }
}