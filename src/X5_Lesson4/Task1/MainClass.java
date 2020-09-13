package X5_Lesson4.Task1;

public class MainClass {

    public static void main(String[] agrs) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle(2);
        shapes[1] = new Triangle(2, 2, 2);
        shapes[2] = new Rectangle(2, 2);

        for (Shape shape : shapes) {
            System.out.println("Площадь фигуры: " + shape.square());
        }

    }
}
