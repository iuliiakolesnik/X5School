package X5_Lesson4.Task1;

public class Triangle implements Shape {

    private double triangleSide1;
    private double triangleSide2;
    private double triangleSide3;

    public Triangle(double triangleSide1, double triangleSide2, double triangleSide3) {
        this.triangleSide1 = triangleSide1;
        this.triangleSide2 = triangleSide2;
        this.triangleSide3 = triangleSide3;
    }

    @Override
    public double square() {
        double p = (this.triangleSide1 + this.triangleSide2 + this.triangleSide1) / 2;
        return Math.pow((p * (p - this.triangleSide1) * (p - this.triangleSide2) * (p - this.triangleSide3)), 0.5);
    }
}
