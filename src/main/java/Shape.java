import java.util.Scanner;

public interface Shape {
    //Methoder til at udregne området og omkreds af geometriske former
    void calculateShape();
    double calculateArea(); //Returnere området
    double calculatePerimeter(); //Returnere omkreds
}
