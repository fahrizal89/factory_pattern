package com.fahrizal.factorypattern.noodles;

import com.fahrizal.factorypattern.factory.NoodlesIngredientFactory;
import com.fahrizal.factorypattern.noodles.Noodles;

public class SamyangNoodles extends Noodles {

    private final NoodlesIngredientFactory noodlesIngredientFactory;

    public SamyangNoodles(NoodlesIngredientFactory noodlesIngredientFactory) {
        this.noodlesIngredientFactory = noodlesIngredientFactory;
        prepare();
    }

    @Override
    public void prepare() {
        name = "Mie Samyang";
        System.out.println("Boiled "+name+" ...");
        isThrowAwayWater = false;
        seasoning = noodlesIngredientFactory.createSeasoning();
        sauce = noodlesIngredientFactory.createSauce();
    }
}
