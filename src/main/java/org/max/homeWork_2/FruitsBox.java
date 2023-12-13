package org.max.homeWork_2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class FruitsBox implements Fruits {

    private final List<Fruits> fruits = new ArrayList<>();

    @Override
    public void fruits() {
        for (Fruits fruit: fruits) {
            fruit.fruits();
        }
    }

    public  void removeFruits(Fruits element){
        fruits.remove(element);
    }
    public void addFruits(Fruits element){
        fruits.add(element);
    }
}
