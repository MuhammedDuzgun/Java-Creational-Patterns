package com.muhammed;

import com.muhammed.factory.Pizza;
import com.muhammed.factory.PizzaStore;
import com.muhammed.factory.SimplePizzaStore;

public class Main {
    public static void main(String[] args) {

        //Prototype
        PrototypeExample prototypeExample = new PrototypeExample("a","b");
        System.out.println(prototypeExample.getField1());
        System.out.println(prototypeExample.getField2());

        System.out.println("-----------------------------------------------------");

        PrototypeExample prototypeExample2 = prototypeExample.clone();
        prototypeExample2.setField1("c");
        prototypeExample2.setField2("d");
        System.out.println(prototypeExample2.getField1());
        System.out.println(prototypeExample2.getField2());

        System.out.println("-----------------------------------------------------");

        //Builder
        Employee employee = new Employee.EmployeeBuilder("Muhammed","Düzgün",24,1)
                .setPhone("123")
//                .setAddress("aaa")
//                .setEmail("aaa@gmail.com")
                .build();
        System.out.println(employee);

        System.out.println("-----------------------------------------------------");

        PizzaStore pizzaStore = new SimplePizzaStore();

        Pizza cheseePizza = pizzaStore.orderPizza("cheese");
        Pizza veggiePizza = pizzaStore.orderPizza("veggie");
        Pizza pepperoniPizza = pizzaStore.orderPizza("pepperoni");

    }
}