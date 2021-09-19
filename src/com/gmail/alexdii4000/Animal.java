package com.gmail.alexdii4000;

public class Animal {
    String name;
    int id;


    public void getInfo(String name, int id) {
        this.name = name;
        this.id = id;
        System.out.println(name+" ,"+id);
    }
}
