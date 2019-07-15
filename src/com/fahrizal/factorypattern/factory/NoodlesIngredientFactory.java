package com.fahrizal.factorypattern.factory;

public interface NoodlesIngredientFactory {

    Seasoning createSeasoning();
    Sauce createSauce();
}
