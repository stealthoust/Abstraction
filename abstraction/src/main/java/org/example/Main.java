package org.example;

import org.example.AnimalWorld.Animal;
import org.example.AnimalWorld.Cat;
import org.example.AnimalWorld.Dog;

public class Main {
    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.makeSound();
        Cat cat=new Cat("grey",22);
        System.out.println(cat.getAge());
        cat.makeSound();
        cat.nonAbstract();
        dog.nonAbstract();

    }
}