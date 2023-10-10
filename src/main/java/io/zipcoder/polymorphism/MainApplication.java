package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pets do you have?");
        int numberOfPets = scanner.nextInt();
        ArrayList<Pet> pets = new ArrayList<>();
        int petCount = 0;
        while (petCount < numberOfPets) {
            scanner.nextLine(); // consume the newline left by nextInt()
            System.out.println("What is your pet/s name? " + (petCount + 1) );
            String name = scanner.nextLine();
            System.out.println("What kind of pet are they? " + (petCount + 1));
            String type = scanner.nextLine();
            Pet pet;
            if ("Dog".equalsIgnoreCase(type)) {
                pet = new Dog(name,type);
            } else if ("Cat".equalsIgnoreCase(type)) {
                pet = new Cat(name, type);
            } else {
                pet = new Pet(name, type);
            }
            pets.add(pet);
            petCount++;
        }

        System.out.println("\nList of your pets:");
        for (Pet pet : pets) {
            System.out.println(pet.getName() + " - " + pet.getType());
            pet.speak();
        }
    }
}