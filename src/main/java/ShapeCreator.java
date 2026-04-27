import java.util.Scanner;

public class ShapeCreator {

    public ShapeCreator createShapeCreator() {
        return new ShapeCreator();
    }

    public void createShape() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose shape: circle / rectangle");

        String shapeType = scanner.nextLine();

        switch (shapeType) {
            case "circle": {
                System.out.println("Enter radius:");
                double radius = scanner.nextDouble();
                Circle circle = new Circle(radius);

                circle.calculateShape();
                break;
            }
            case "rectangle": {
                System.out.println("Enter length:");
                double length = scanner.nextDouble();
                System.out.println("Enter width:");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                rectangle.calculateShape();
                break;
            }
            default: {
                System.out.println("Unknown shape");
            }
        }
    }
}
