public class Circle extends Figure implements Pi {
    Circle() {
	super();
    }
    Circle(double x, double y, double a, double b) {
	super(x, y, a, b);
    }
    Circle(double x, double y, double a, double b, Color fC, Color lC) {
	super(x, y, a, b, fC, lC);
    }
    @Override
    public void setDim(double a, double b) {
	this.a = a;
	this.b = a;
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

