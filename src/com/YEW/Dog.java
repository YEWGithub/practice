package com.YEW;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/6/26 13:57
 * @version: 1.0
 * @modified By:
 */
public class Dog extends Mammal implements IAnimal{
    private String color;

    void Dog() {
        this.color="black";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void eat() {
        System.out.println("狗在吃饭");
    }

    @Override
    public void shout() {
        System.out.println("狗在叫");
    }


}
