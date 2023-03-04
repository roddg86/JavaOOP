package HW.hw1;

import HW.hw1.child.*;
import HW.hw1.parent.Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Bird bird = new Bird("Аист", "Белый");
        bird.speak();
        bird.fly();
        System.out.printf("Ноги %d\n", (bird.getLegsCount()));
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Dragon dragon = new Dragon("Самоцвет ", "Огненный ");
        dragon.speak();
        dragon.fly();
        System.out.printf("Legs %d\n", dragon.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Bear bear = new Bear("Тайга", "Бурый");
        bear.speak();
        bear.toGo();
        bear.fly(); // проблема
        System.out.printf("Legs %d\n", bear.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Horse horse = new Horse("Буцефал", "Вороной");
        horse.speak();
        horse.toGo();
        System.out.printf("Legs %d\n", horse.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Fish fish = new Fish("Амиго", "Желтый");
        fish.speak();
        fish.swim();
        fish.hunt();
        fish.setName("Pixel"); // проблема
        System.out.printf("Имя %s\n", fish.getName());
        System.out.printf("Цвет %s\n", fish.getColor());
        System.out.printf("Ноги %d\n", fish.getLegsCount()); // проблема
        System.out.printf("Тип %s\n", fish.getType().replace("Fish", "Bear")); // проблема
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Fish fish1 = new Fish("Grey", 2); // проблема
        System.out.printf("Имя %s\n", fish1.getName()); // проблема
        System.out.printf("Ноги %d\n", fish1.getLegsCount()); // проблема
        fish1.toGo(); // проблема
        System.out.println(String.format("%5s", "").replace(" ", "-"));

        Octopus octopus = new Octopus("Бленд", "Коричневый");
        octopus.speak(); // проблема
        octopus.swim();
        System.out.printf("Цвет %s\n", octopus.getColor());
        System.out.printf("Ноги %d\n", octopus.getLegsCount());
        System.out.println(String.format("%5s", "").replace(" ", "-"));

    }
}
