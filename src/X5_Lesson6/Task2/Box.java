package X5_Lesson6.Task2;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruitArrayList;

    public Box() {
        fruitArrayList = new ArrayList<Fruit>();
    }

    public boolean checkEmptyBox() {
        if (fruitArrayList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBox(Fruit f) {
        if (fruitArrayList.get(0).getClass() == f.getClass()) {
            return true;
        } else {
            return false;
        }
    }

    public void addFruit(Fruit f) {
        if (checkEmptyBox()) {
            this.fruitArrayList.add(f);
        } else {
            if (checkBox(f)) {
                this.fruitArrayList.add(f);
            } else {
                System.out.println("В коробке лежат другие фрукты");
            }
        }
    }

    public double getWeight() {
        double weight = 0;
        if (fruitArrayList.get(0).getClass() == Apple.class) {
            for (Fruit f : fruitArrayList){
                weight = weight + f.getWeight();
            }
        }
        if (fruitArrayList.get(0).getClass() == Orange.class) {
            for (Fruit f : fruitArrayList){
                weight = weight + f.getWeight();
            }
        }
        return weight;
    }

    public void printBox() {
        for (Fruit f : fruitArrayList) {
            System.out.print(f + " ");
        }
        System.out.println();
    }

    public boolean compare(Box b) {
        if (this.getWeight() == b.getWeight()) {
            return true;
        } else {
            return false;
        }
    }

    public void moveFruit(Box b)
    {
        if(b.checkEmptyBox()){
            for (Fruit f: this.fruitArrayList){
                b.fruitArrayList.add(f);
            }
            this.fruitArrayList.clear();
        } else {
            if (this.fruitArrayList.get(0).getClass() == b.fruitArrayList.get(0).getClass()){
                for (Fruit f: this.fruitArrayList){
                    b.fruitArrayList.add(f);
                }
                this.fruitArrayList.clear();
            } else {
                System.out.println("В коробках разные фрукты");
            }
        }
    }
}
