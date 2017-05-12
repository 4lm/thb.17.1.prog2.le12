public class Square extends Figure implements Dimension {
    Square() {
	super();
    }
    Square(double x, double y, double a, double b) {
	super(x, y, a, b);
    }
    Square(double x, double y, double a, double b, Color fC, Color lC) {
	super(x, y, a, b, fC, lC);
    }
    @Override
    public void setDim(double a, double b) {
	this.a = a;
	this.b = b;
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
	return "Square";
    }
}
