package X5_Lesson3.Task2;

public class Cat extends Animal {
    private String color;

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void makeNoise() {
        System.out.println("Кошка шумит");
    }

    void eat() {
        System.out.println("Кошка ест");
    }

    Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }
}