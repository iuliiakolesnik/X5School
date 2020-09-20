package X5_Lesson4.Task1;

public class Circle implements Shape {

    private double radius;

    @Override
    public double square() {
        return Math.PI * Math.pow(this.radius, 2);
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}
