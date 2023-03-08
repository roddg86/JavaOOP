package com.github.roddg86;


import com.github.roddg86.impl.*;
import com.github.roddg86.parent.*;
import com.github.roddg86.parent.Runnable;
import com.github.roddg86.veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Барсик","Белый"))
                .addAnimal(new Duck("Дональд","Черный"))
                .addAnimal(new Bear("Тайга", "Бурый"));

        //vetClinic.getRunnable().forEach(System.out::println);
        //vetClinic.getFlyable().forEach(System.out::println);
        //vetClinic.getSerializable().forEach(System.out::println);
        //vetClinic.getSpeakable().forEach(System.out::println);
        //vetClinic.getSerializable().forEach(System.out::println);

        for (int i = 0; i < vetClinic.getAnimals().size(); i++) {
            System.out.print(vetClinic.getAnimals().get(i).getName() + " ");
        }
        System.out.println();

        Human human = new Human("Айболит", 5);
        human.speak();
        human.vaccination();
        human.bandaging();

        /**
         * Список для наследников интерфейса Illable(способных заболеть)
         */
        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("Барсик"));
        //illables.add(new Human());

        //Выведем тех кто заболел
        for (Illable illable : illables
        ) {
            illable.vaccination();
            illable.bandaging();
            //illable.getRunSpeed();
        }

        /**
         * Список для наследников интерфейса Flyable(умеющих летать)
         */
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle("Самоцвет", "Огненный"));
        flyables.add(new Duck("Donald", "Черный"));

        //Выведем тех кто летит
        for (Flyable fly : flyables
        ) {
            fly.toFly();
            fly.getFlightSpeed();
        }

        /**
         * Список для наследников интерфейса Runnable(умеющих бегать)
         */
        List<Runnable> runnables = new ArrayList<>();
        runnables.add(new Bear("Тайга", "Бурый"));
        runnables.add(new Cat("Пушок", "Белый"));

        // Выведем тех кто бежит
        for (Runnable run : runnables
        ) {
            run.toGo();
            run.getRunSpeed();
        }

        /**
         * Список для наследников интерфейса Swimable(умеющих плавать)
         */
        List<Swimable> swimables = new ArrayList<>();
        swimables.add(new Fish("Амиго", "Желтый"));
        swimables.add(new Octopus("Бленд", "Коричневый"));

        // Выведем тех кто плывет
        for (Swimable swim : swimables
        ) {
            swim.toSwim();
            swim.getSwimSpeed();
        }

        System.out.printf("Количество наследников класса Animal = %d", Animal.getAnimalsCount());

//        Bird bird = new Bird("Аист", "Белый");
//        bird.speak();
//        bird.fly();
//        System.out.printf("Ноги %d\n", (bird.getLegsCount()));
//        System.out.println(String.format("%5s", "").replace(" ", "-"));
//
//        Dragon dragon = new Dragon("Самоцвет ", "Огненный ");
//        dragon.speak();
//        dragon.fly();
//        System.out.printf("Legs %d\n", dragon.getLegsCount());
//        System.out.println(String.format("%5s", "").replace(" ", "-"));
//
//        Bear bear = new Bear("Тайга", "Бурый");
//        bear.speak();
//        bear.toGo();
//        bear.fly(); // проблема
//        System.out.printf("Legs %d\n", bear.getLegsCount());
//        System.out.println(String.format("%5s", "").replace(" ", "-"));
//
//        Horse horse = new Horse("Буцефал", "Вороной");
//        horse.speak();
//        horse.toGo();
//        System.out.printf("Legs %d\n", horse.getLegsCount());
//        System.out.println(String.format("%5s", "").replace(" ", "-"));
//
//        Fish fish = new Fish("Амиго", "Желтый");
//        fish.speak();
//        fish.swim();
//        fish.hunt(); // проблема
//        fish.setName("Pixel"); // проблема
//        System.out.printf("Имя %s\n", fish.getName());
//        System.out.printf("Цвет %s\n", fish.getColor());
//        System.out.printf("Ноги %d\n", fish.getLegsCount()); // проблема
//        System.out.printf("Тип %s\n", fish.getType().replace("Fish", "Bear")); // проблема
//        System.out.println(String.format("%5s", "").replace(" ", "-"));
//
//        Fish fish1 = new Fish("Grey", 2); // проблема
//        System.out.printf("Имя %s\n", fish1.getName()); // проблема
//        System.out.printf("Ноги %d\n", fish1.getLegsCount()); // проблема
//        fish1.toGo(); // проблема
//        System.out.println(String.format("%5s", "").replace(" ", "-"));
//
//        Octopus octopus = new Octopus("Бленд", "Коричневый");
//        octopus.speak(); // проблема
//        octopus.swim();
//        System.out.printf("Цвет %s\n", octopus.getColor());
//        System.out.printf("Ноги %d\n", octopus.getLegsCount());
//        System.out.println(String.format("%5s", "").replace(" ", "-"));

    }
}
