package HW.hw1.child;

import HW.hw1.parent.Animal;

public class Dragon extends Animal {

    public Dragon(String name, String color) {
        super(name, color, 2);
    }

    @Override
    public void speak() {
        System.out.printf("%s speaks: Growl-Growl!%n", getType());
    }

    public void fly() {
        System.out.printf("%s flew!%n", getType());
    }
}
