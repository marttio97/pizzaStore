package com.Chef;

import com.food.Food;
import com.food.Pizza;
import com.recipe.Recipe;

public class Chef {
    public Food prepare(Recipe recipe) {
        Food pizza = new Pizza();
        pizza.setIngredients(recipe.getToppings());
        return pizza;
    }

}
