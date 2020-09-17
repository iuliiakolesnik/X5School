package X5_Lesson6.Task1;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        ArrayList<String> stringArray = new ArrayList<>();

        int elementCount = 10;
        int deleteIndex = 3;
        int findIndex = 0;

        for (int i = 0; i < elementCount; i++) {
            stringArray.add(UUID.randomUUID().toString());
        }

        System.out.println("Размер коллекции: " + stringArray.size());

        for (String x : stringArray) {
            System.out.print(x + ", ");
        }

        stringArray.remove(deleteIndex);

        System.out.println("\nРазмер коллекции после удаления элемента по индексу: " + stringArray.size());

        for (String x : stringArray) {
            System.out.print(x + ", ");
        }

        String deletedObject = stringArray.get(findIndex);
        stringArray.remove(deletedObject);

        System.out.println("\nРазмер коллекции после удаления элемента по элементу: " + stringArray.size());

        for (String x : stringArray) {
            System.out.print(x + ", ");
        }

        stringArray.clear();
        System.out.println("\nРазмер коллекции после очищения: " + stringArray.size());

        for (String x : stringArray) {
            System.out.print(x + ", ");
        }
    }
}
