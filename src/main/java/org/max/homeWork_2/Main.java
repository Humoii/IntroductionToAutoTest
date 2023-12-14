package org.max.homeWork_2;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Banana banana = new Banana();
        Orange orange = new Orange();

        FruitsBox fruitsBox = new FruitsBox();
        FruitsBox fruitsBox1 = new FruitsBox();
        FruitsBox fruitsBox2 = new FruitsBox();

        fruitsBox2.addFruits(apple);
        fruitsBox2.addFruits(banana);
        fruitsBox2.addFruits(orange);

        fruitsBox1.addFruits(apple);
        fruitsBox1.addFruits(orange);
        fruitsBox1.addFruits(orange);
        fruitsBox1.addFruits(orange);

        fruitsBox.addFruits(fruitsBox1);
        fruitsBox.addFruits(fruitsBox2);

        fruitsBox.addFruits(apple);
        fruitsBox.addFruits(orange);

        System.out.println("Количество фруктов: " + fruitsBox.fruits());
    }
}
