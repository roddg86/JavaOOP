package HW.hw1;

import HW.hw1.child.Bird;
import HW.hw1.child.Dog;
import HW.hw1.child.Duck;
import HW.hw1.parent.Animal;
import HW.hw1.child.Cat;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //        Animal animal = new Animal();
        //        Animal vaska = new Cat("������", "�����");
        //
        //        System.out.println(vaska);
        //        System.out.println(vaska.getType());
        //
        //        animal.speak();
        //        vaska.speak();
        //        Duck duck = new Duck("������", 2);
        //        System.out.println(duck);
        //        Dog dog = new Dog("�����", "�����");
        //
        //        List<Animal> animals = new ArrayList<>();
        //        animals.add(vaska);
        //        animals.add(duck);
        //        animals.add(dog);
        //        animals.add(animal);
        //        animals.forEach(Animal::speak);
        //        System.out.println("--------летчики------------");
        //
        //        for (Animal a : animals) {
        //            if (a instanceof Duck) {
        //                ((Duck) a).fly();
        //            }
        //        }
        //        System.out.println("--------охота------------");
        //
        //        vaska.hunt();

        Bird bird = new Bird("Stork", "White");
        bird.speak();
        bird.fly();
        Animal animal = new Animal();
        animal.fly();
    }
}
