package Task2;

public class Animal {
    private String food;
    private String location;

    public String getFood() {
        return this.food;
    }

    public String getLocation() {
        return this.location;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    void makeNoise() {
        System.out.println("Такое-то животное шумит");
    }

    void eat() {
        System.out.println("Такое-то животное ест");
    }

    void sleep() {
        System.out.println("Такое-то животное спит");
    }

    Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }
}
