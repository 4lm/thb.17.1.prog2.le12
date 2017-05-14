package net.michaltsis.paint;

/**
 * Circle class
 */
public class Circle extends Figure implements Pi {
    // Constructors
    Circle() {
        super();
    }
    Circle(double x, double y, double a, double b) {
        super(x, y, a, b);
    }
    Circle(double x, double y, double a, double b, Color fC, Color lC) {
        super(x, y, a, b, fC, lC);
    }

    // Methods
    /**
     * @param a behaves as diameter.
     * @param b will not be used. a will be assigned to this.b.
     */
    @Override
    public void setDim(double a, double b) {
        this.a = a;
        this.b = a;
    }
    @Override
    public double circumference() {
        return 2 * PI * (a / 2);
    }
    @Override
    public double area() {
        return PI * (a / 2) * (a / 2);
    }
    @Override
    public String getForm() {
        return "Circle";
    }
}