package Task2;

public class Dog extends Animal {
    private String breed;

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    void makeNoise() {
        System.out.println("Собака шумит");
    }

    void eat() {
        System.out.println("Собака ест");
    }

    Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }
}
