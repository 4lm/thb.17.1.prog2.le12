public class Circle {
    private double r;
    private double PI = Math.PI;
    Circle() {
	r = 0;
    }
    public double circumference() {
	return 2 * PI * r;
    }
    public double area() {
	return PI * r * r;
    }
    public void show() {
	System.out.println("Radius : " + getRadius());
	System.out.println("Umfang : " + circumference());
	System.out.println("Flaeche: " + area());
    }
    public void setRadius(double r) {
	this.r = r;
    }
    public double getRadius() {
	return r;
    }  
}

