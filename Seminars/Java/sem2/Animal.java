package Seminars.Java.sem2;

public abstract class Animal {
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


    /**
     * Абстрактный метод - это говорит о том что я этот метод в этом классе реализовывать не хочу
     * потому что я незнаю как он тут должен быть реализован, я буду реализовывать его в наследниках.
     */
    public abstract void speak();

    /**
     *Абстрактный метод
     */
    public abstract void hunt();

    /**
     * метод Заболел
     */
    public void getIll(){
        System.out.printf("%s заболел%n", this.getType());
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
