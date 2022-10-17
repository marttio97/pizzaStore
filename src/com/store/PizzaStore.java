package com.store;

import com.Chef.Chef;
import com.pizza.Pizza;
import com.recipe.PepperoniPizzaRecipe;
import com.recipe.PlainPizzaRecipe;
import com.recipe.Recipe;
import com.recipe.RecipeFactory;

public class PizzaStore {

    public Pizza OrderPizza(String order) {
        RecipeFactory recipeFactory = new RecipeFactory();
        Recipe recipe = recipeFactory.getRecipe(order);

        Chef chef = new Chef();

        return chef.prepare(recipe);
    }

}


