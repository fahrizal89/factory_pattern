package com.fahrizal.factorypattern.store;

import com.fahrizal.factorypattern.factory.KoreaNoodlesIngredientsFactory;
import com.fahrizal.factorypattern.factory.NoodlesIngredientFactory;
import com.fahrizal.factorypattern.noodles.Noodles;
import com.fahrizal.factorypattern.noodles.indonesia.GorengNoodles;
import com.fahrizal.factorypattern.noodles.indonesia.IgaBakarNoodles;
import com.fahrizal.factorypattern.noodles.indonesia.SamyangNoodles;

public class KoreaNoodleStore extends NoodleStore {

    @Override
    Noodles createNoodles(String type) {
        Noodles noodles=null;
        NoodlesIngredientFactory noodlesIngredientFactory = new KoreaNoodlesIngredientsFactory();

        if(type.equals("SAMYANG")){
            noodles = new SamyangNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Samyang Korea";
        }
        else if(type.equals("IGA BAKAR")){
            noodles = new IgaBakarNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Iga Bakar Korea";
        }
        else if(type.equals("GORENG")){
            noodles = new GorengNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Goreng Korea";
        }

        return noodles;
    }
}
