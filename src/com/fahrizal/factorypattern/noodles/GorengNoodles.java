package com.fahrizal.factorypattern.noodles;

import com.fahrizal.factorypattern.factory.NoodlesIngredientFactory;
import com.fahrizal.factorypattern.noodles.Noodles;

public class GorengNoodles extends Noodles {

    private final NoodlesIngredientFactory noodlesIngredientFactory;

    public GorengNoodles(NoodlesIngredientFactory noodlesIngredientFactory) {
        this.noodlesIngredientFactory = noodlesIngredientFactory;
        prepare();
    }

    @Override
    public void prepare() {
        name = "Mie Goreng";
        System.out.println("preparing..." +name);
        isThrowAwayWater = true;
        seasoning = noodlesIngredientFactory.createSeasoning();
        sauce = noodlesIngredientFactory.createSauce();
    }
}
