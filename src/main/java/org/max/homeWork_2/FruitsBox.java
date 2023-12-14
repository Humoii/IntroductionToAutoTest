package org.max.homeWork_2;

import java.util.ArrayList;
import java.util.List;

public class FruitsBox implements Fruits {

    private final List<Fruits> fruits = new ArrayList<>();

    @Override
    public Integer fruits() {
        int i = 0;
        SumFruits sumFruits = new SumFruits(i);
        for (Fruits fruit : fruits) {
            i = sumFruits.sumFruits(fruit.fruits());
        }
        return i;
    }

    public  void removeFruits(Fruits element){
        fruits.remove(element);
    }
    public void addFruits(Fruits element){
        fruits.add(element);
    }
}
