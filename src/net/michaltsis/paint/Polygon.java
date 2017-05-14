package net.michaltsis.paint;

/**
 * Polygon class. Regular polygons with 3 to n corners
 */
public class Polygon extends Figure implements Pi {
    // Attribute
    private int n;

    // Constructors
    Polygon() {
        super();
        n = 3;
    }
    Polygon(double x, double y, double a, double b, int n) {
        super(x, y, a, b);
        this.n = n;
        if (n < 3)
            n = 3;
    }
    Polygon(double x, double y, double a, double b, int n, Color fC, Color lC) {
        this(x, y, a, b, n);
        fillColor = fC;
        lineColor = lC;
    }

    // Methods
    @Override
    public void setDim(double a, double b) {
        this.a = a;
        this.b = a;
    }
    @Override
    public double circumference() {
        return 2 * n * (a / 2) * Math.sin(PI / n);
    }
    @Override
    public double area() {
        return ((n * (a / 2) * (a / 2)) / 2) * Math.sin((2 * PI) / n);
    }
    @Override
    public String getForm() {
        return "Polygon with " + n + " corners";
    }
}