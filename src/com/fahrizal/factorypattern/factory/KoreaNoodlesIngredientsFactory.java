package com.fahrizal.factorypattern.factory;

public class KoreaNoodlesIngredientsFactory implements NoodlesIngredientFactory {
    @Override
    public Seasoning createSeasoning() {
        return new Seasoning();
    }

    @Override
    public Sauce createSauce() {
        return new Sauce();
    }
}
