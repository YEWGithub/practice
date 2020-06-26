package com.YEW;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Mammal mammal = new Dog();
        mammal.setId(110);
        System.out.println("id="+mammal.getId());
        mammal.setName("Hobby");
        System.out.println("name="+mammal.getName());
        mammal.setLegNum(4);
        System.out.println("legName="+mammal.getLegNum());
        
        mammal.eat();
        mammal.shout();


    }
}
