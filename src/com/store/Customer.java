package com.store;

import com.food.Food;
import com.food.Pizza;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private Food pizza;
    private List<String> order = new ArrayList<>();

    private List<Food> readyOrder = new ArrayList<>();

    public String Order()
    {


        return order.toString();
//
//        for (String product : order) {
//            pizza = store.Order(product);
//            readyOrder.add(pizza);
//        }
//
//        InspectPizzaToppings();
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

        for (Food pizza : readyOrder) {
            System.out.println(pizza.getIngredients());
        }
    }

}
