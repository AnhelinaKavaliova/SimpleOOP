package Shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 10);
        Triangle triangle = new Triangle(5, 6, 8);

        circle.printInfo();
        rectangle.printInfo();
        triangle.printInfo();
    }
}
