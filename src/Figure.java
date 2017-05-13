abstract class Figure {
    protected double x, y, a, b;
    protected Color fillColor;
    protected Color lineColor;
    Figure() {
	x = 0;
	y = 0;
        a = 0;
        b = 0;
    }
    Figure(double x, double y, double a, double b) {
	this.x = x;
	this.y = y;
        this.a = a;
	this.b = b;
    }
    Figure(double x, double y, double a, double b, Color fC, Color lC) {
	this(x, y, a, b);
	fillColor = fC;
	lineColor = lC;
    }
    public void setPos(double x, double y) {
	this.x = x;
	this.y = y;
    }
    public void setDim(double a, double b) {
	this.a = a;
	this.b = b;
    }
    public void setColors(Color fC, Color lC) {
	fillColor = fC;
	lineColor = lC;
    }
    public String getForm() {
	return "Figure";
    }
    public double getX() {
	return x;
    }
    public double getY() {
	return y;
    }
    public double getWidth() {
	return a;
    }
    public double getHeight() {
	return b;
    }
    public String getColors() {
	return "Fill: " + fillColor.getRGB() + " Line: " + lineColor.getRGB();
    }
    @Override
    public String toString() {
	return getForm();
    }
    public abstract double circumference();
    public abstract double area();
}
