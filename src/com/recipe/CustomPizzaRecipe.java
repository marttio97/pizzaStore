package com.recipe;

import com.store.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomPizzaRecipe implements Recipe {

    public List<String> Toppings = new ArrayList<>();

    public CustomPizzaRecipe(List<String> Toppings) {
        this.Toppings = Toppings;
    }
    @Override
    public List<String> getToppings() {
        return Toppings;
    }
}
