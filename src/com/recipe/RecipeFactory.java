package com.recipe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecipeFactory {

    public Recipe getRecipe(String order) {
        if (order.equals("Plain")) {
            return new PlainPizzaRecipe();
        }

        if (order.equals("Pepperoni")) {
            return new PepperoniPizzaRecipe();
        }

        List<String> customIngredients = new ArrayList<>(Arrays.asList(order.split(",")));

        return new CustomPizzaRecipe(customIngredients);
    }
}
