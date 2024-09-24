package Prog5;

// AreaCalculator class with overloaded calculateArea methods
class AreaCalculator {

    // Method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side; // Area of a square = side^2
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width; // Area of a rectangle = length * width
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius, boolean isCircle) {
        return Math.PI * radius * radius; // Area of a circle = π * radius^2
    }
}

// Main class to demonstrate the use of overloaded methods
public class Main {

    public static void main(String[] args) {
        // Create an object of AreaCalculator
        AreaCalculator calculator = new AreaCalculator();

        // Calculate the area of a square with side length 5.0
        double squareArea = calculator.calculateArea(5.0);
        System.out.println("Area of square with side 5.0: " + squareArea);

        // Calculate the area of a rectangle with length 4.0 and width 6.0
        double rectangleArea = calculator.calculateArea(4.0, 6.0);
        System.out.println("Area of rectangle with length 4.0 and width 6.0: " + rectangleArea);

        // Calculate the area of a circle with radius 3.0
        double circleArea = calculator.calculateArea(3.0, true);
        System.out.println("Area of circle with radius 3.0: " + circleArea);
    }
}
