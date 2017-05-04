public class Circle extends Figure {
    Circle() {
	super();
    }
    Circle(double x, double y, double a, double b) {
	super();
    }
    Circle(double x, double y, double a, double b, Color fC, Color lC) {
	super();
    }
    @Override
    public double circumference() {
	return 2 * PI * (a/2);
    }
    @Override
    public double area() {
	return PI * (a/2) * (a/2);
    }
    @Override
    public String getForm() {
	return "Circle";
    }
}

