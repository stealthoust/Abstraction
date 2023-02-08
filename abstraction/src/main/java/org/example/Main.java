package org.example;

import org.example.AnimalWorld.Animal;
import org.example.AnimalWorld.Cat;
import org.example.AnimalWorld.Dog;
import org.example.AnimalWorld.Lion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Mittens", 3, "black"));
        animalList.add(new Cat("Whiskers", 2, "orange"));
        animalList.add(new Dog("Fido", 5, "brown"));
        animalList.add(new Dog("Buddy", 4, "black"));
        animalList.add(new Lion("Simba", 6, "golden"));
        animalList.add(new Lion("Mufasa", 8, "brown"));
        animalList.add(new Cat("Socks", 1, "grey"));
        animalList.add(new Cat("Smokey", 2, "black"));
        animalList.add(new Dog("Max", 3, "brown"));
        animalList.add(new Dog("Rocky", 4, "black"));
        animalList.add(new Lion("Scar", 5, "golden"));
        animalList.add(new Lion("Zira", 7, "brown"));


        Dog dog=new Dog();
        dog.makeSound();
        dog.nonAbstract();

        List<Animal> oldestAnimals= animalList.stream().sorted(Comparator.comparing(Animal::getAge).reversed()).limit(3).toList();
        List<Animal> brownAnimals=animalList.stream().filter(a->a.getColor().equals("brown")).toList();
        System.out.println("3 Oldest Animals");
        oldestAnimals.forEach(s-> System.out.println(s.getName()));
        System.out.println("Brown Animals");
        brownAnimals.forEach(s-> System.out.println(s.getName()));

    }
}