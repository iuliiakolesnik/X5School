package X5_Lesson6.Task2;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruitArrayList;

    public Box() {
        this.fruitArrayList = new ArrayList<Fruit>();
    }

    public boolean checkEmptyBox() {
        return (this.fruitArrayList.size() == 0);
    }

    public boolean checkBox(Fruit f) {
        return (this.fruitArrayList.get(0).getClass() == f.getClass());
    }

    public void addFruit(Fruit f) {
        if (this.checkEmptyBox()) {
            this.fruitArrayList.add(f);
        } else {
            if (this.checkBox(f)) {
                this.fruitArrayList.add(f);
            } else {
                System.out.println("В коробке лежат другие фрукты");
            }
        }
    }

    public float getWeight() {
        float total_weight = 0.0f;
        for (Fruit f : this.fruitArrayList) {
            total_weight = total_weight + f.getWeight();
        }
        return total_weight;
    }

    public void printBox() {
        for (Fruit f : fruitArrayList) {
            System.out.print(f + ": ");
            f.printInfo();
        }
        System.out.println();
    }

    public boolean compare(Box b) {
        return (this.getWeight() == b.getWeight());
    }

    public void moveFruit(Box b) {
        if (b.checkEmptyBox()) {
            b.fruitArrayList.addAll(this.fruitArrayList);
            this.fruitArrayList.clear();
        } else {
            if (this.fruitArrayList.get(0).getClass() == b.fruitArrayList.get(0).getClass()) {
                b.fruitArrayList.addAll(this.fruitArrayList);
                this.fruitArrayList.clear();
            } else {
                System.out.println("В коробках разные фрукты");
            }
        }
    }
}
