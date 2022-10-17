package com.Chef;

import com.pizza.Pizza;
import com.recipe.Recipe;

public class Chef {
    public Pizza prepare(Recipe recipe){
        Pizza pizza = new Pizza();
        pizza.setToppings(recipe.getToppings());
        return pizza;
    }

}
