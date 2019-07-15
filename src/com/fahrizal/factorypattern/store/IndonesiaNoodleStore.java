package com.fahrizal.factorypattern.store;

import com.fahrizal.factorypattern.factory.IndonesiaNoodlesIngredientsFactory;
import com.fahrizal.factorypattern.factory.NoodlesIngredientFactory;
import com.fahrizal.factorypattern.noodles.Noodles;
import com.fahrizal.factorypattern.noodles.GorengNoodles;
import com.fahrizal.factorypattern.noodles.IgaBakarNoodles;
import com.fahrizal.factorypattern.noodles.SamyangNoodles;

public class IndonesiaNoodleStore extends NoodleStore {

    @Override
    Noodles createNoodles(String type) {
        Noodles noodles=null;
        NoodlesIngredientFactory noodlesIngredientFactory = new IndonesiaNoodlesIngredientsFactory();

        if(type.equals("SAMYANG")){
            noodles = new SamyangNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Samyang";
        }
        else if(type.equals("IGA BAKAR")){
            noodles = new IgaBakarNoodles(noodlesIngredientFactory);
            noodles.name = "Mie Iga Bakar";
        }
        else if(type.equals("GORENG")){
            noodles = new GorengNoodles( noodlesIngredientFactory);
            noodles.name = "Mie Goreng";
        }

        return noodles;
    }
}
