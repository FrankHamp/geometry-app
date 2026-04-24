import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public static void createCircle(ShapeCalculator calculator, Scanner scanner){
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);

        double area = circle.calculateArea(radius);
        double circumference = circle.calculateCircumference(radius);

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }

    public double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

}
