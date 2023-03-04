package HW.hw1;

import HW.hw1.child.*;
import HW.hw1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird("����", "�����");
        bird.speak();
        bird.fly();
        System.out.printf("���� %d\n", (bird.getLegsCount()));
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Dragon dragon = new Dragon("�������� ", "�������� ");
        dragon.speak();
        dragon.fly();
        System.out.printf("Legs %d\n", dragon.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Bear bear = new Bear("�����", "�����");
        bear.speak();
        bear.toGo();
        bear.fly(); // ��������
        System.out.printf("Legs %d\n", bear.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Horse horse = new Horse("�������", "�������");
        horse.speak();
        horse.toGo();
        System.out.printf("Legs %d\n", horse.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Fish fish = new Fish("�����", "������");
        fish.speak();
        fish.swim();
        fish.hunt();
        fish.setName("Pixel"); // ��������
        System.out.printf("��� %s\n", fish.getName());
        System.out.printf("���� %s\n", fish.getColor());
        System.out.printf("���� %d\n", fish.getLegsCount()); // ��������
        System.out.printf("��� %s\n", fish.getType().replace("Fish", "Bear")); // ��������
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Fish fish1 = new Fish("Grey", 2); // ��������
        System.out.printf("��� %s\n", fish1.getName()); // ��������
        System.out.printf("���� %d\n", fish1.getLegsCount()); // ��������
        fish1.toGo(); // ��������
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Octopus octopus = new Octopus("�����", "����������");
        octopus.speak(); // ��������
        octopus.swim();
        System.out.printf("���� %s\n", octopus.getColor());
        System.out.printf("���� %d\n", octopus.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

    }
}
