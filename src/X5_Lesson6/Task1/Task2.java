package X5_Lesson6.Task1;

import java.util.*;


public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        int elementCount = 10;
        int deleteIndex = 3;
        int findIndex = 0;

        for (int i = 0; i < elementCount; i++) {
            stringLinkedList.add(UUID.randomUUID().toString());
        }

        System.out.println("Размер коллекции: " + stringLinkedList.size());

        for (String x : stringLinkedList) {
            System.out.print(x + ", ");
        }

        stringLinkedList.remove(deleteIndex);

        System.out.println("\nРазмер коллекции после удаления элемента по индексу: " + stringLinkedList.size());

        for (String x : stringLinkedList) {
            System.out.print(x + ", ");
        }

        String deletedObject = stringLinkedList.get(findIndex);
        stringLinkedList.remove(deletedObject);

        System.out.println("\nРазмер коллекции после удаления элемента по элементу: " + stringLinkedList.size());

        for (String x : stringLinkedList) {
            System.out.print(x + ", ");
        }

        stringLinkedList.clear();
        System.out.println("\nРазмер коллекции после очищения: " + stringLinkedList.size());

        for (String x : stringLinkedList) {
            System.out.print(x + ", ");
        }
    }
}
