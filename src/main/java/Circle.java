import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public static void createCircle(ShapeCalculator calculator, Scanner scanner){
        System.out.println("Enter radius:");
        double radius = scanner.nextDouble();

        double area = calculator.calculateCircleArea(radius);
        double circumference = calculator.calculateCircleCircumference(radius);

        System.out.println("Area: " + area);
        System.out.println("Circumference: " + circumference);
    }
}
