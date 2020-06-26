package com.YEW;

/**
 * @description:
 * @author: 86177
 * @date: Created in 2020/6/26 13:53
 * @version: 1.0
 * @modified By:
 */
public abstract class Mammal implements IAnimal {

    private int id;
    private String name;
    private int legNum;

    public Mammal() {
        legNum=4;
    }

    public Mammal(int legNum) {
        this.legNum = legNum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLegNum() {
        return legNum;
    }

    public void setLegNum(int legNum) {
        this.legNum = legNum;
    }
}
