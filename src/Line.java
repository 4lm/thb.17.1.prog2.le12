public class Line extends Rectangle {
    Line() {
	super();
    }
    Line(double x, double y, double a, double b) {
	super(x, y, a, b);
    }
    Line(double x, double y, double a, double b, Color fC, Color lC) {
	super(x, y, a, b, fC, lC);
    }
    @Override
    public String getForm() {
	return "Line";
    }
}
