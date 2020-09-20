package X5_Lesson3.Task2;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void makeNoise() {
        System.out.println("Собака шумит");
    }

    public void eat() {
        System.out.println("Собака ест");
    }

    public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }
}
