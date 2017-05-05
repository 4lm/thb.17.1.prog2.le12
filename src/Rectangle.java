public class Rectangle extends Figure {
    Rectangle() {
	super();
    }
    Rectangle(double x, double y, double a, double b) {
	super(x, y, a, b);
    }
    Rectangle(double x, double y, double a, double b, Color fC, Color lC) {
	super(x, y, a, b, fC, lC);
    }
    @Override
    public double circumference() {
	return 2*a + 2*b;
    }
    @Override
    public double area() {
	return a * b;
    }
    @Override
    public String getForm() {
	return "Rectangle";
    }
}
