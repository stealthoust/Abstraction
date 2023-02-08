package org.example.AnimalWorld;

public class Dog extends Animal implements AnimalActions{

    public Dog() {
    }

    public Dog(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Hau Hau");
    }

    @Override
    public void eat() {
        System.out.println("Dog eating... ");
    }

    @Override
    public void sleep() {
        System.out.println("Dog sleeping... ");
    }

    @Override
    public void move() {
        System.out.println("Dog moves");
    }

    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}
