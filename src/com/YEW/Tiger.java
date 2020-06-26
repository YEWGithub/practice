package com.YEW;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/6/26 14:06
 * @version: 1.0
 * @modified By:
 */
public class Tiger extends Mammal implements IAnimal{
    private int weight;

    public Tiger() {
        this.weight=0;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public void eat() {
        System.out.println("老虎在吃饭");
    }

    @Override
    public void shout() {
        System.out.println("老虎在叫");
    }
}
