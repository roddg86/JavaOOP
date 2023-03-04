package HW.hw1.child;

import HW.hw1.parent.Animal;

/**
 * Плавающие
 * Сущность рыба
 */
public class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color);
    }

    // проблема
    public Fish(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void swim() {
        System.out.printf("%s Плавание%n", getType());
    }
}
