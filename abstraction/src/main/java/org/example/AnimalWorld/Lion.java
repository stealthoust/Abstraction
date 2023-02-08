package org.example.AnimalWorld;

public class Lion extends Animal implements AnimalActions{

    public Lion() {
    }

    public Lion(String name, int age, String color) {
        super(name, age, color);
    }

    @Override
    void makeSound() {
        System.out.println("Roar");
    }

    @Override
    void eat() {
        System.out.println("Lion eating... ");
    }

    @Override
    void sleep() {
        System.out.println("Lion sleeping... ");
    }

    @Override
    public void move() {
        System.out.println("Lion moves");
    }

    @Override
    public void play() {
        System.out.println("Lion is playing");
    }
}
