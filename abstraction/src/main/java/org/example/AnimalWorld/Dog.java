package org.example.AnimalWorld;

public class Dog extends Animal{
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

}
