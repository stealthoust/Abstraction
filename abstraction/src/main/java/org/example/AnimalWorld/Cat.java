package org.example.AnimalWorld;

public class Cat extends Animal implements AnimalActions{



    public Cat() {
    }

    public Cat(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow");

    }

    @Override
    public void eat() {
        System.out.println("Cat eating... ");
    }

    @Override
    public void sleep() {
        System.out.println("Cat sleeping... ");
    }

    @Override
    public void nonAbstract() {
        System.out.println("Cat non abstract");
    }

    @Override
    public void move() {
        System.out.println("Cat moves");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }
}
