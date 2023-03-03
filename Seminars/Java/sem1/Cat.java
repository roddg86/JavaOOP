package Seminars.Java.sem1;

public class Cat extends Animal {

    // вызвать конструктор родителя
    public Cat(String name, String color) {
        super(name, color,4);
    }

    public Cat(String name) {
        super(name);
    }

    // полиморфизм
    @Override
    public void speak() {
        System.out.println("Meow!");
    }
}
