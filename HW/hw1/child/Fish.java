package HW.hw1.child;

import HW.hw1.parent.Animal;

/**
 * ���������
 * �������� ����
 */
public class Fish extends Animal {
    public Fish(String name, String color) {
        super(name, color);
    }

    // ��������
    public Fish(String color, int legsCount) {
        super(color, legsCount);
    }

    @Override
    public void swim() {
        System.out.printf("%s ��������%n", getType());
    }
}
