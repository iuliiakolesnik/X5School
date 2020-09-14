package X5_Lesson3.Task2;

import java.util.*;

public class MainClass {
    public static void main(String[] args) {
        Doctor doctor = new Doctor();

        ArrayList<Animal> animals = new ArrayList<Animal>();

        Animal dog = new Dog("мясо", "Тольятти", "Корги");
        Cat cat = new Cat("молоко", "Москва", "Голубая");
        Horse horse = new Horse("овес", "Самара", 5);
        Animal animal = new Animal("капуста", "Екатеринбург");

        animals.add(dog);
        animals.add(cat);
        animals.add(horse);
        animals.add(animal);

        for (Animal i : animals) {
            doctor.threadAnimal(i);
            i.makeNoise();
            i.eat();
            i.sleep();
        }
    }
}
