package Seminars.Java.sem1.impl;

import Seminars.Java.sem1.Animal;
import Seminars.Java.sem1.Flyable;
import Seminars.Java.sem1.Illable;

/**
 * Сущность Орел
 */
public class Eagle extends Animal implements Flyable, Illable {

    /**
     * пришел из интерфейса Flyable
     * @return возвращает скорость с которой летит орел
     */
    @Override
    public int getFlightSpeed() {
        return 100;
    }


    /**
     * пришел из интерфейса Illable
     */
    @Override
    public void getIll() {

    }

    /**
     * пришел из класса Animal
     */
    @Override
    public void speak() {

    }

    /**
     * пришел из класса Animal
     */
    @Override
    public void hunt() {

    }
}
