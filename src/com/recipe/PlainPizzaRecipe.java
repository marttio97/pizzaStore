package com.recipe;

import java.util.ArrayList;
import java.util.List;

public class PlainPizzaRecipe implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public PlainPizzaRecipe()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
    }

    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}

