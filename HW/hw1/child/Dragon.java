package HW.hw1.child;

import HW.hw1.parent.Animal;

/**
 * Летающие
 * Сущность дракон
 */
public class Dragon extends Animal {

    public Dragon(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s говорит: Рычание-Рычание!%n", getType());
    }

    public void fly() {
        System.out.printf("%s летал!%n", getType());
    }
}
