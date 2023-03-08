package org.example;

import impl.Animal;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Animal animal = new Animal();
        animal.setName("Борис");
        System.out.println(animal.getName());
    }
}