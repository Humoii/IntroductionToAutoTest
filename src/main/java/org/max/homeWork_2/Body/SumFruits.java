package org.max.homeWork_2.Body;

public class SumFruits {
    private int sum;

    public SumFruits(int sum) {
        this.sum = sum;
    }

    public int sumFruits(Integer i){
        sum = i + sum;
        return sum;
    }
}
