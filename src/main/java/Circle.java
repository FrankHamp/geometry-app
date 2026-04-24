import java.util.Scanner;

public class Circle implements Shape{
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public static void createCircle(Scanner scanner){
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        double area = circle.calculateArea();
        double circumference = circle.calculatePerimeter();

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
