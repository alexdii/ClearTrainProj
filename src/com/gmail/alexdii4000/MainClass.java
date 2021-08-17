package com.gmail.alexdii4000;

public class MainClass {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.name = "Dog";
        animal.id = 1;
        animal.getInfo(animal.name, animal.id);
        Cat cat = new Cat();
        cat.name = "Tom";
        cat.id = 2;
        cat.getInfo(cat.name, cat.id);
        cat.canMiau();

    }
}
