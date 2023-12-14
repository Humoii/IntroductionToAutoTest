package org.max.homeWork_2.FruitsFolder;

import org.max.homeWork_2.Body.Fruits;

public class Apple implements Fruits {
    @Override
    public Integer fruits() {
        System.out.println("Яблоко");
        return 1;
    }
}
