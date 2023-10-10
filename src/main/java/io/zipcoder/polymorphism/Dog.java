package io.zipcoder.polymorphism;

public class Dog extends Pet{


    public Dog(String name, String type) {
        super(name, "Dog");
    }

    @Override
    public void speak(){
        System.out.println(getName()+ " Bark! Bark!");
    }
}
