package HW.hw1.child;

import HW.hw1.parent.Animal;

/**
 * ���������
 * �������� ��������
 */
public class Octopus  extends Animal {
    public Octopus(String name, String color) {
        super(name, color, 8);
    }

    @Override
    public void swim() {
        System.out.printf("%s ��������%n", getType());
    }
}
