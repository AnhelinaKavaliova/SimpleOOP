package Shapes;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    @Override
    public double area(){
        return Math.PI*Math.pow(radius, 2);
    }
    @Override
    public double perimeter(){
        return 2*Math.PI*radius;
    }
    @Override
    public void printInfo(){
        System.out.println("Area of circle: " + area());
        System.out.println("Perimeter of circle: " + perimeter());
    }
}
