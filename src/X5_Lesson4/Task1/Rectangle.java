package X5_Lesson4.Task1;

public class Rectangle implements Shape {

    private double length;
    private double height;

    public Rectangle(double length, double height) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double square() {
        return this.length * this.height;
    }
}
