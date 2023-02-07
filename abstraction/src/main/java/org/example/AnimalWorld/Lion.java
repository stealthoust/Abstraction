package org.example.AnimalWorld;

public class Lion extends Animal{
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
}
