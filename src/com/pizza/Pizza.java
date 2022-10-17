package com.pizza;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    List<String> Toppings = new ArrayList<>();

    public void setToppings(List<String> toppings) {
        Toppings.addAll(toppings);
    }

    public List<String> getToppings() {
        return Toppings;
    }
}
