package com.store;

import com.pizza.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Pizza pizza;
    private List<String> order = new ArrayList<>();

    private List<Pizza> readyOrder = new ArrayList<>();

    public void Order()
    {
        PizzaStore store = new PizzaStore();

        for (String product : order) {
            pizza = store.OrderPizza(product);
            readyOrder.add(pizza);
        }

        InspectPizzaToppings();
    }

    public void add(String product) {
        order.add(product);
    }

    public void remove(String product) {
        order.remove(product);
    }

    private void InspectPizzaToppings()
    {
        if (order.isEmpty()) {
            System.out.println("Order is empty.");
        }

        for (Pizza pizza : readyOrder) {
            System.out.println(pizza.getToppings());
        }
    }

}
