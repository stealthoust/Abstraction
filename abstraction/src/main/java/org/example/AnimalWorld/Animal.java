package org.example.AnimalWorld;

public abstract class Animal {

    protected String name;
    protected int age;
    protected String color;

    public Animal() {
    }

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    abstract void makeSound();
    abstract void eat();
    abstract void sleep();
    public static void test(){
        System.out.println("Test of the static method");
    }

    public void nonAbstract(){
        System.out.println("Non abstract");
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
