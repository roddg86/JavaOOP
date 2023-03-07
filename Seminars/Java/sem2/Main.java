package Seminars.Java.sem2;

import Seminars.Java.sem2.veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("Мурзик"))
                .addAnimal(new Dog("Бобик"))
                .addAnimal(new Duck("Дональд"))
                .addAnimal(new Human("Вася"));
    }

}
