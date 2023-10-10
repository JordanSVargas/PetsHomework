package io.zipcoder.polymorphism;

import java.util.Scanner;

public class Cat extends Pet{


    public Cat(String name, String type) {
        super(name, "Cat");
    }
    @Override
    public void speak(){
        System.out.println(getName() + " Meow Meow");
    }
}
