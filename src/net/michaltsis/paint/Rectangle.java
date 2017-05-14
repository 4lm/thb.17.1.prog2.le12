package net.michaltsis.paint;

public class Rectangle extends Square {
    // Constructors
    Rectangle() {
        super();
    }
    Rectangle(double x, double y, double a, double b) {
        super(x, y, a, b);
    }
    Rectangle(double x, double y, double a, double b, Color fC, Color lC) {
        super(x, y, a, b, fC, lC);
    }

    // Method
    @Override
    public String getForm() {
        return "Rectangle";
    }
}