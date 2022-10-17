package com.store;

import com.Chef.Chef;
import com.food.Food;
import com.food.Pizza;
import com.recipe.Recipe;
import com.recipe.RecipeFactory;

public class PizzaStore implements Store {

    public Food Order(String order) {
        RecipeFactory recipeFactory = new RecipeFactory();
        Recipe recipe = recipeFactory.getRecipe(order);

        Chef chef = new Chef();

        return chef.prepare(recipe);
    }

}


