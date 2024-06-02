package org.example.hw;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------- ПОИСК ОСВЕЖАЮЩИХ НАПИТКОВ ---------");
        VendingMachineBottle vmBottle = new VendingMachineBottle();
        List<BottleOfWater> bottleList = new ArrayList<>(Arrays.asList(
                new BottleOfWater(prod.Rich.toString(), new BigDecimal(37), 0.5),
                new BottleOfWater(prod.Baikal.toString(), new BigDecimal(35), 0.45),
                new BottleOfWater(prod.Borjomi.toString(), new BigDecimal(53), 0.43),
                new BottleOfWater("Lipton", new BigDecimal(45), 0.5)));
        vmBottle.initProduct(bottleList);
        System.out.println(vmBottle.getProduct("Lipton"));

        System.out.println("----------------- ПОИСК ГОРЯЧИХ НАПИТКОВ ---------");
        VendingMachineHotDrinks vmHotDrinks = new VendingMachineHotDrinks();
        List<HotDrinks> hotDrinksList = new ArrayList<>(Arrays.asList(
                new HotDrinks("Coffee", new BigDecimal(200), 0.3, 90),
                new HotDrinks("BlackTea", new BigDecimal(102), 0.4, 80),
                new HotDrinks("HotMilk", new BigDecimal(111), 1.0, 50)));
        vmHotDrinks.initProduct(hotDrinksList);
        System.out.println("Поиск по названию: " + vmHotDrinks.getProduct("Coffee"));
        System.out.println("Поиск по цене <=: " + vmHotDrinks.getProduct(new BigDecimal(102)));
        System.out.println("Поиск по температуре <=: " + vmHotDrinks.getProduct(70));
    }

    enum prod {
        Rich,
        Baikal,
        Borjomi,
    }
}
