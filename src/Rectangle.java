public class Rectangle extends Figure {
    Rectangle() {
	super();
    }
    Rectangle(double x, double y, double a, double b) {
	super();
    }
    Rectangle(double x, double y, double a, double b, Color fC, Color lC) {
	super();
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
