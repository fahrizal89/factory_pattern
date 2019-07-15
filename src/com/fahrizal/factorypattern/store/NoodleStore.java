package com.fahrizal.factorypattern.store;

import com.fahrizal.factorypattern.noodles.Noodles;

public abstract class NoodleStore {

    public Noodles orderNoodles(String type){
        Noodles noodles;
        noodles = createNoodles(type);

        noodles.mix();
        noodles.drainWell();
        return noodles;
    }

    abstract Noodles createNoodles(String type);
}
