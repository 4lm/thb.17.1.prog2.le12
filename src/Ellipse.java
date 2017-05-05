public class Ellipse extends Figure {
    Ellipse() {
	super();
    }
    Ellipse(double x, double y, double a, double b) {
	super(x, y, a, b);
    }
    Ellipse(double x, double y, double a, double b, Color fC, Color lC) {
	super(x, y, a, b, fC, lC);
    }
    @Override
    public double circumference() {
	return 2 * PI * Math.sqrt((Math.pow((a/2),2) + Math.pow((b/2),2)) / 2);
    }
    @Override
    public double area() {
	return PI * (a/2) * (b/2);
    }
    @Override
    public String getForm() {
	return "Ellipse";
    }
}
