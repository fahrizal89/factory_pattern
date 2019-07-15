package com.fahrizal.factorypattern.factory;

public class IndonesiaNoodlesIngredientsFactory implements NoodlesIngredientFactory {
    @Override
    public Seasoning createSeasoning() {
        return new Seasoning();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }
}
