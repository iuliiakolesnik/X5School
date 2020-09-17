package X5_Lesson6.Task2;

import java.util.ArrayList;

public class Box {
    private ArrayList<Fruit> fruitArrayList;

    public Box() {
        this.fruitArrayList = new ArrayList<Fruit>();
    }

    public boolean checkEmptyBox() {
        if (this.fruitArrayList.size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean checkBox(Fruit f) {
        if (this.fruitArrayList.get(0).getClass() == f.getClass()) {
            return true;
        } else {
            return false;
        }
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

    public double getWeight() {
        double weight = 0;
        for (Fruit f : this.fruitArrayList){
            weight = weight + f.getWeight();
        }
        return weight;
    }

    public void printBox() {
        for (Fruit f : fruitArrayList) {
            System.out.print(f + ": ");
            f.printInfo();
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
