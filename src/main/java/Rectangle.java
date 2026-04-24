import java.util.Scanner;

class Rectangle implements Shape {
    double length;
    double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public static void createRectangle(Scanner scanner) {
        System.out.println("Enter Length:");
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(length, width);

        double area = rectangle.calculateArea();
        double perimeter = rectangle.calculatePerimeter();

        System.out.println("length: " + length);
        System.out.println("width: " + width);
    }

    @Override
    public double calculateArea() {
        return length * width;
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
