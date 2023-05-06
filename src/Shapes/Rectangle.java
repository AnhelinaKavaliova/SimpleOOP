package Shapes;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    public double area(){
        return width * height;
    }
    @Override
    public double perimeter(){
        return 2.0 * (width + height);
    }

    @Override
    public void printInfo(){
        System.out.println("Area of rectangle: " + area());
        System.out.println("Perimeter of rectangle: " + perimeter());
    }
}
