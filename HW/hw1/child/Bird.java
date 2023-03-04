package HW.hw1.child;

import HW.hw1.parent.Animal;

/**
 * Летающие
 * Сущность птица
 */
public class Bird extends Animal {
    public Bird(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s говорит: Чирик-Чирик!%n", getType());
    }

    public void fly() {
        System.out.printf("%s летал!%n", getType());
    }
}
