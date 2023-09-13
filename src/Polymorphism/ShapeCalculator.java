package Polymorphism;

public class ShapeCalculator {
    // Method to calculate the area of a circle
    public double calculateArea(double radius) {

        return Math.PI * radius * radius;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle
    public double calculateArea(double base, double height, String shape) {
        if ("triangle".equalsIgnoreCase(shape)) {
            return 0.5 * base * height;
        } else {

            throw new IllegalArgumentException("Unsupported shape: " + shape);
        }
    }

}