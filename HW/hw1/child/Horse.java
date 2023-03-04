package HW.hw1.child;

import HW.hw1.parent.Animal;

/**
 * ��������
 * �������� ������
 */
public class Horse extends Animal {
    public Horse(String name, String color) {
        super(name, color, 4);
    }

    @Override
    public void speak() {
        System.out.printf("%s �������: ������!%n", getType());
    }

    @Override
    public void toGo() {
        System.out.printf("%s � ���%n", getType());
    }
}
