package com.recipe;

import java.util.ArrayList;
import java.util.List;

public class PepperoniPizzaRecipe implements Recipe {
    public List<String> Toppings = new ArrayList<>();
    public PepperoniPizzaRecipe()
    {
        Toppings.add("Tomato");
        Toppings.add("Cheese");
        Toppings.add("Pepperoni");
    }

    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}
