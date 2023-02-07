package org.example.AnimalWorld;

public class Cat extends Animal{

    public Cat(String color) {
        this.color=color;
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
}
