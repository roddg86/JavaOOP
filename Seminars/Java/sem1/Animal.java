package Seminars.Java.sem1;

public class Animal {
    // поля класса
    public String name;
    private String color;
    private int pawsCount;

    public String getType(){
        // метод присылает строчку энимал
        return this.getClass().getSimpleName();
    }

    // конструктор класса, главный конструктор
    public Animal(String name, String color, int pawsCount) {
        this.name = name;
        this.color = color;
        this.pawsCount = pawsCount;
    }

    // конструктор вызывающий главный конструктор
    public Animal(String name){
        this(name, null, 0);
    }

    public Animal() {
        this(null);
    }

    @Override
    public String toString() {
        return String.format("Имя:%s, Цвет: %s", this.name, this.color);
    }

    public void wakeUP(){
        System.out.println("Woke up..");
    }

    public void findFood(){
        System.out.println("Found food..");
    }

    public void eat(){
        System.out.println("Eat..");
    }

    public void speak(){
        System.out.println("Speak..");
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getPawsCount() {
        return pawsCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPawsCount(int pawsCount) {
        this.pawsCount = pawsCount;
    }
}
