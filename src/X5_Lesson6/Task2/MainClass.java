package X5_Lesson6.Task2;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {
        Fruit apple = new Apple(1);
        Fruit apple1 = new Apple(2);
        Fruit apple2 = new Apple(3);
        Fruit orange = new Orange(1);
        Fruit orange1 = new Orange(2);
        Fruit orange2 = new Orange(2);

        Box box_apple = new Box();
        Box box_orange = new Box();
        Box box_empty = new Box();


        box_apple.addFruit(apple);
        box_apple.addFruit(apple1);
        box_apple.addFruit(apple2);
        box_apple.printBox();
        box_apple.addFruit(orange);

        box_orange.addFruit(orange);
        box_orange.addFruit(orange1);
        box_orange.addFruit(orange2);
        box_orange.printBox();
        box_orange.addFruit(apple);

        System.out.println("ВЕС коробки c яблоками: " + box_apple.getWeight());
        System.out.println("Вес коробки с апельсинами: " + box_orange.getWeight());

        if (box_apple.compare(box_orange)){
            System.out.println("Коробки одинакового веса");
        } else{
            System.out.println("Коробки разного веса");
        }
        System.out.println("Из коробки с яблоками в коробку с апельсинами");
        box_apple.moveFruit(box_orange);
        //box_apple.printBox();
        System.out.println("Из коробки с яблоками в пустую коробку");
        box_apple.moveFruit(box_empty);
        System.out.println("Коробка из которой высыпали");
        box_apple.printBox();
        System.out.println("Пустая коробка теперь с яблоками");
        box_empty.printBox();
        System.out.println("Из коробки с апельсинами в коробку с яблоками");
        box_orange.moveFruit(box_empty);
        System.out.println("Из коробки с апельсинами в пустую коробку из-под яблока");
        box_orange.moveFruit(box_apple);
        System.out.println("\nПустая коробка из-под яблок теперь с апельсинами");
        box_apple.printBox();
        System.out.println("Пустая коробка из-под апельсин");
        box_orange.printBox();
        System.out.println("Ранее пустая коробка теперь с яблоками");
        box_empty.printBox();

        //box.printBox();


    }
}
