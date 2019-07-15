package com.fahrizal.factorypattern.noodles;

import com.fahrizal.factorypattern.factory.Sauce;
import com.fahrizal.factorypattern.factory.Seasoning;

public abstract class Noodles {

    public String name;
    public boolean isThrowAwayWater;
    public Seasoning seasoning;
    public Sauce sauce;
    public abstract void prepare();

    public void mix(){
        System.out.println("Mix noodles");
    }

    public void drainWell(){
        System.out.println("Drain well noodles");
    }
}
