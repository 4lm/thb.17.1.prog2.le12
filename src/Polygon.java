public class Polygon extends Figure {
    private int n;
    private double l;
    Polygon() {
	super();
	n = 3;
	l = 0;
    }
    Polygon(double x, double y, int n, double l) {
	this.x = x;
	this.y = y;
	switch (n) {
	case 3:
	    this.n = 3;
	    break;
	case 4:
	    this.n = 4;
	    break;
	case 5:
	    this.n = 5;
	    break;
	case 6:
	    this.n = 6;
	    break;
	case 8:
	    this.n = 8;
	    break;
	case 10:
	    this.n = 10;
	    break;
	case 12:
	    this.n = 12;
	    break;
	default:
	    this.n = 3;
	}
	this.l = l;
    }
    Polygon(double x, double y, int n, double l, Color fC, Color lC) {
	this(x, y, n, l);
	fillColor = fC;
	lineColor = lC;
    }
    @Override
    public double getWidth() {
	double w;
	switch (n) {
	case 3:
	    w = l;
	    break;
	case 4:
	    w = l;
	    break;
	case 5:
	    w = l * Math.sqrt((1/5) * (5 + (2 * Math.sqrt(5))));
	    break;
	case 6:
	    w = l * Math.sqrt(3);
	    break;
	case 8:
	    w = l * (2 * (1 + Math.sqrt(2)));
	    break;
	case 10:
	    w = l * Math.sqrt(5 + (2 * Math.sqrt(5)));
	    break;
	case 12:
	    w = l * (2 + Math.sqrt(3));
	    break;
	default:
	    w = 0;
	}
	return w;
    }
    @Override
    public double getHeight() {
	double h;
	switch (n) {
	case 3:
	    h = Math.sqrt(l - (l/2));
	    break;
	case 4:
	    h = l;
	    break;
	case 5:
	    h = l * Math.sqrt((1/5) * (5 + (2 * Math.sqrt(5))));
	    break;
	case 6:
	    h = l * Math.sqrt(3);
	    break;
	case 8:
	    h = l * (2 * (1 + Math.sqrt(2)));
	    break;
	case 10:
	    h = l * Math.sqrt(5 + (2 * Math.sqrt(5)));
	    break;
	case 12:
	    h = l * (2 + Math.sqrt(3));
	    break;
	default:
	    h = 0;
	}
	return h;
    }
    @Override
    public double circumference() {
	double value;
	switch (n) {
	case 3:
	    value = l * 3;
	    break;
	case 4:
	    value = l * 4;
	    break;
	case 5:
	    value = l * 5;
	    break;
	case 6:
	    value = l * 6;
	    break;
	case 8:
	    value = l * 8;
	    break;
	case 10:
	    value = l * 10;
	    break;
	case 12:
	    value = l * 12;
	    break;
	default:
	    value = l * 3;
	}
	return value;
    }
    @Override
    public double area() {
	double value;
	switch (n) {
	case 3:
	    value = Math.pow(l, 2) * ((1/4) * Math.sqrt(3));
	    break;
	case 4:
	    value = Math.pow(l, 2);
	    break;
	case 5:
	    value = Math.pow(l, 2) * ((1/4) * Math.sqrt(5 * (5 + (2 * Math.sqrt(5)))));
	    break;
	case 6:
	    value = Math.pow(l, 2) * ((3/2) * Math.sqrt(3));
	    break;
	case 8:
	    value = Math.pow(l, 2) * 2 * (1 + Math.sqrt(2));
	    break;
	case 10:
	    value = Math.pow(l, 2) * ((5/2) * Math.sqrt(5 + (2 * Math.sqrt(5))));
	    break;
	case 12:
	    value = Math.pow(l, 2) * 3 * (2 + Math.sqrt(3));
	    break;
	default:
	    value = Math.pow(l, 2) * ((1/4) * Math.sqrt(3));
	}
	return value;
    }
    @Override
    public String getForm() {
	return "Polygon";
    }
    public void setCorner(int n) {
	this.n = n;
    }
    public int getCorner() {
	return n;
    }
    public void setSideLength() {
	this.l = l;
    }
    public double getSideLength() {
	return l;
    }
}
