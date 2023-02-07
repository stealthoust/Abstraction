package org.example.AnimalWorld;

public abstract class Animal {

    protected String color;
    protected int age;

    public Animal() {
    }

    public Animal(String color, int age) {
        this.color = color;
        this.age = age;
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
}
