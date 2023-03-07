//package Seminars.Java.sem1;
//
//public class Cat extends Animal {
//
//    // вызвать конструктор родителя
//    public Cat(String name, String color) {
//        super(name, color,4);
//    }
//
//    public Cat(String name) {
//        super(name);
//    }
//
//    // Инкапсуляция
//    // на примере метода hunt
//    // соблюдение порядка вызова методов
//    // невозможно нарушить поряд вызова методов они инкапсулированы и приватные
//    public void hunt(){
//        wakeUP();
//        findFood();
//        eat();
//    }
//
//    // полиморфизм
//    @Override
//    public void speak() {
//        System.out.println("Meow!");
//    }
//
//    private void wakeUP(){
//        // просыпание
//        // один из поведенческих методов
//        System.out.println("Woke up..");
//    }
//
//    private void findFood(){
//        System.out.println("Found food..");
//    }
//
//    private void eat(){
//        System.out.println("Eat..");
//    }
//}
