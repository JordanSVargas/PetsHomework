package io.zipcoder.polymorphism;

public class Fish extends Pet{
    public Fish(String name, String type) {
        super(name, "Fish");
    }
    @Override
    public void speak(){
        System.out.println(getName()+  " Gulp Gulp");
    }
}
