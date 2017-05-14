package net.michaltsis.paint;

public class Square extends Figure {
    // Constructors
    Square() {
        super();
    }
    Square(double x, double y, double a, double b) {
        super(x, y, a, b);
    }
    Square(double x, double y, double a, double b, Color fC, Color lC) {
        super(x, y, a, b, fC, lC);
    }

    // Methods
    @Override
    public double circumference() {
        return 2 * a + 2 * b;
    }
    @Override
    public double area() {
        return a * b;
    }
    @Override
    public String getForm() {
        return "Square";
    }
}