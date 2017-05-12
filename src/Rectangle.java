public class Rectangle extends Square implements Dimension {
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
    public void setDim(double a, double b) {
	this.a = a;
	this.b = b;
    }
    @Override
    public String getForm() {
	return "Rectangle";
    }
}
