package X5_Lesson3.Task2;

public class Horse extends Animal {
    private int winCount;

    public int getWin() {
        return this.winCount;
    }

    public void setWin(int win) {
        this.winCount = win;
    }

    public void makeNoise() {
        System.out.println("Лошадь шумит");
    }

    public void eat() {
        System.out.println("Лошадь ест");
    }

    public Horse(String food, String location, int winCount) {
        super(food, location);
        this.winCount = winCount;
    }
}