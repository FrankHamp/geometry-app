import java.util.Scanner;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public void calculateShape(){
        double area = calculateArea();
        double circumference = calculatePerimeter();

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;

    }
}
