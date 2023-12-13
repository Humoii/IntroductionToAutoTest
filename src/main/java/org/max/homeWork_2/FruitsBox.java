package org.max.homeWork_2;

import java.util.ArrayList;
import java.util.List;

public class FruitsBox implements Fruits {

    private final List<Fruits> fruits = new ArrayList<>();

    @Override
    public void fruits() {
        int i = 0;
        for (Fruits fruit: fruits) {
            i++;
            fruit.fruits();
        }
        System.out.println(i);
    }

    public  void removeFruits(Fruits element){
        fruits.remove(element);
    }
    public void addFruits(Fruits element){
        fruits.add(element);
    }
}
