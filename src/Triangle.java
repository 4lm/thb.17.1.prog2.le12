public class Triangle extends Figure implements Dimension {
    Triangle() {
	super();
    }
    Triangle(double x, double y, double a, double b) {
	super(x, y, a, b);
    }
    Triangle(double x, double y, double a, double b, Color fC, Color lC) {
	super(x, y, a, b, fC, lC);
    }
    @Override
    public void setDim(double a, double b) {
	this.a = a;
	this.b = b;
    }
    @Override
    public double circumference() {
	return 2 * Math.sqrt((a/2)*(a/2) + b*b) + a;
    }
    @Override
    public double area() {
	return (a * b) / 2;
    }
    @Override
    public String getForm() {
	return "Triangle";
    }
}
