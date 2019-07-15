package com.fahrizal.factorypattern;

import com.fahrizal.factorypattern.noodles.Noodles;
import com.fahrizal.factorypattern.store.IndonesiaNoodleStore;
import com.fahrizal.factorypattern.store.KoreaNoodleStore;
import com.fahrizal.factorypattern.store.NoodleStore;

public class Main {

    public static final String SAMYANG = "SAMYANG";
    public static final String IGA_BAKAR = "IGA BAKAR";
    public static final String GORENG = "GORENG";

    public static void main(String[] args){
        NoodleStore indonesianStore = new IndonesiaNoodleStore();
        Noodles indonesianNoodles = indonesianStore.orderNoodles(SAMYANG);
        System.out.println("thow away water? "+indonesianNoodles.isThrowAwayWater);
        System.out.println("===================");

        NoodleStore koreanStore = new KoreaNoodleStore();
        Noodles koreanGorengNoodles = koreanStore.orderNoodles(GORENG);
        System.out.println("thow away water? "+koreanGorengNoodles.isThrowAwayWater);
        System.out.println("===================");

        Noodles koreanIgaBakarNoodles = koreanStore.orderNoodles(IGA_BAKAR);
        System.out.println("thow away water? "+koreanIgaBakarNoodles.isThrowAwayWater);
    }
}
