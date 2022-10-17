package com.food;

import java.util.ArrayList;
import java.util.List;

public class Pizza implements Food {
    List<String> Toppings = new ArrayList<>();

    public void setIngredients(List<String> toppings) {
        Toppings.addAll(toppings);
    }

    public List<String> getIngredients() {
        return Toppings;
    }
}
