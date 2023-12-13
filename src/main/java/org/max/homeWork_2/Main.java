package org.max.homeWork_2;

public class Main {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        Banana banana1 = new Banana();
        Orange orange1 = new Orange();

        Apple apple2 = new Apple();
        Orange orange2 = new Orange();
        Orange orange3 = new Orange();
        Orange orange4 = new Orange();

        FruitsBox fruitsBox = new FruitsBox();
        FruitsBox fruitsBox1 = new FruitsBox();
        FruitsBox fruitsBox2 = new FruitsBox();

        fruitsBox2.addFruits(apple1);
        fruitsBox2.addFruits(banana1);
        fruitsBox2.addFruits(orange1);

        fruitsBox1.addFruits(apple2);
        fruitsBox1.addFruits(orange2);
        fruitsBox1.addFruits(orange3);
        fruitsBox1.addFruits(orange4);

        fruitsBox.addFruits(fruitsBox);
        fruitsBox.addFruits(fruitsBox1);

        fruitsBox.fruits();
    }
}
