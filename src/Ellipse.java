public class Ellipse extends Circle implements Dimension, Pi {
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
    public void setDim(double a, double b) {
	this.a = a;
	this.b = b;
    }
    @Override
    public double circumference() {
	return 2 * PI * Math.sqrt((Math.pow((a/2),2) + Math.pow((b/2),2)) / 2);
    }
    @Override
    public String getForm() {
	return "Ellipse";
    }
}
