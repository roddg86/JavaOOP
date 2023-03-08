package Seminars.Java.sem2;

import Seminars.Java.sem1.Animal;
import Seminars.Java.sem1.Flyable;
import Seminars.Java.sem1.Illable;
import Seminars.Java.sem1.impl.Cat;
import Seminars.Java.sem1.impl.Dog;
import Seminars.Java.sem1.impl.Duck;
import Seminars.Java.sem1.impl.Eagle;
import Seminars.Java.veterinary.VetClinic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        VetClinic vetClinic = new VetClinic();
        vetClinic
                .addAnimal(new Cat("������"))
                .addAnimal(new Dog("�����"))
                .addAnimal(new Duck("�������"));

        /**
         * ������ ��� ����������� ���������� Illable(��������� ��������)
         */
        List<Illable> illables = new ArrayList<>();
        illables.add(new Cat("������"));
        illables.add(new Human());

        /**
         * ������ ��� ����������� ���������� Flyable(������� ������)
         */
        List<Flyable> flyables = new ArrayList<>();
        flyables.add(new Eagle());
        flyables.add(new Duck("Donald"));

        // ������� ��������
        for (Flyable f : flyables
             ) {
            System.out.println(f.getFlightSpeed());
        }

        System.out.printf("���������� ����������� ������ Animal = %d", Animal.getAnimalsCount());
    }
}
