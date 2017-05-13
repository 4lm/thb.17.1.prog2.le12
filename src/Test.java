public class Test {
    public static void main(String[] args) {
	// Test Color
	Color color = new Color();
	color.setRGB(255, 11, 127);
	if (color.getRGB() == 16714623)
	    System.out.println("Color t1: success");
	else
	    System.out.println("Color t1: fail - expected: 16714623; delivered: " + color.getRGB());
        color.setRGB(354, -123, 257); // Should change value to 255, 0, 255
	if (color.getRGB() == 16711935)
	    System.out.println("Color t2: success");
	else
	    System.out.println("Color t2: fail - expected: 16711935; delivered: " + color.getRGB());
	// Test Figures
	Figure circle = new Circle(0,0,10,10);
	Figure ellipse = new Ellipse(0,0,10,5);
	Figure square = new Square(0,0,10,10);
	Figure rectangle = new Rectangle(0,0,10,5);
	Figure line = new Line(0,0,1,10);
	Figure triangle = new Triangle(0,0,10,10);
	Figure polygon = new Polygon(0,0,8,0.765366865);
	System.out.println("\nCircle       : " + circle.toString());
	System.out.println("Width        : " + circle.getWidth());
	System.out.println("Height       : " + circle.getHeight());
	System.out.println("Circumference: " + circle.circumference());
	System.out.println("Area         : " + circle.area());
	
	System.out.println("\nEllipse      : " + ellipse.toString());
	System.out.println("Width        : " + ellipse.getWidth());
	System.out.println("Height       : " + ellipse.getHeight());
	System.out.println("Circumference: " + ellipse.circumference());
	System.out.println("Area         : " + ellipse.area());
	
	System.out.println("\nSquare       : " + square.toString());
	System.out.println("Width        : " + square.getWidth());
	System.out.println("Height       : " + square.getHeight());
	System.out.println("Circumference: " + square.circumference());
	System.out.println("Area         : " + square.area());
	
	System.out.println("\nRectangle    : " + rectangle.toString());
	System.out.println("Width        : " + rectangle.getWidth());
	System.out.println("Height       : " + rectangle.getHeight());
	System.out.println("Circumference: " + rectangle.circumference());
	System.out.println("Area         : " + rectangle.area());
	
	System.out.println("\nLine         : " + line.toString());
	System.out.println("Width        : " + line.getWidth());
	System.out.println("Height       : " + line.getHeight());
	System.out.println("Circumference: " + line.circumference());
	System.out.println("Area         : " + line.area());
	
	System.out.println("\nTriangle     : " + triangle.toString());
	System.out.println("Width        : " + triangle.getWidth());
	System.out.println("Height       : " + triangle.getHeight());
	System.out.println("Circumference: " + triangle.circumference());
	System.out.println("Area         : " + triangle.area());
	
        System.out.println("\nPolygon      : " + polygon.toString());
	System.out.println("Width        : " + polygon.getWidth());
	System.out.println("Height       : " + polygon.getHeight());
	System.out.println("Circumference: " + polygon.circumference());
	System.out.println("Area         : " + polygon.area());
    }
}
