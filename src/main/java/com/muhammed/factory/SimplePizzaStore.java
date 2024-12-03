package com.muhammed.factory;

public class SimplePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            return new CheesePizza();
        } else if (type.equals("pepperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("veggie")) {
            return new VeggiePizza();
        } else {
            throw new IllegalArgumentException("Unknown pizza type : " + type);
        }
    }
}
