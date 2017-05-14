package net.michaltsis.paint;

/**
 * Line class
 */
public class Line extends Rectangle {
    // Constructors
    Line() {
        super();
    }
    Line(double x, double y, double a, double b) {
        super(x, y, a, b);
    }
    Line(double x, double y, double a, double b, Color fC, Color lC) {
        super(x, y, a, b, fC, lC);
    }

    // Method
    @Override
    public String getForm() {
        return "Line";
    }
}