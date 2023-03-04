package HW.hw1.child;

import Seminars.Java.sem1.Animal;

public class Bird extends Animal {
    public Bird(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s speaks: Chirik-Chirik!%n", getType());
    }

    public void fly() {
        System.out.printf("%s flew!%n", getType());
    }
}
