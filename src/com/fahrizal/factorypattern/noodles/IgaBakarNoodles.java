package com.fahrizal.factorypattern.noodles;

import com.fahrizal.factorypattern.factory.NoodlesIngredientFactory;
import com.fahrizal.factorypattern.noodles.Noodles;

public class IgaBakarNoodles extends Noodles {

    private final NoodlesIngredientFactory noodlesIngredientFactory;

    public IgaBakarNoodles(NoodlesIngredientFactory noodlesIngredientFactory) {
        this.noodlesIngredientFactory = noodlesIngredientFactory;
        prepare();
    }

    @Override
    public void prepare() {
        name = "Mie Goreng Iga Bakar";
        System.out.println("Boiled "+name+" ...");
        isThrowAwayWater = true;
        seasoning = noodlesIngredientFactory.createSeasoning();
        sauce = noodlesIngredientFactory.createSauce();
    }
}
