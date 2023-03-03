package Seminars.Java.sem1;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal(null,null,1);
        System.out.println(animal.getColor());

        Animal animal1 = new Animal("собака");
        System.out.println(animal1.getPawsCount());
        
    }
    
}
