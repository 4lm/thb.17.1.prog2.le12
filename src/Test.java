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
	Figure ellipse = new Ellipse(0,0,10,10);
	Figure rectangle = new Rectangle(0,0,10,10);
	System.out.println("Circle: " + circle.toString());
	System.out.println(circle.circumference());
	System.out.println(circle.area());
	System.out.println("Ellipse: " + ellipse.toString());
	System.out.println(ellipse.circumference());
	System.out.println(ellipse.area());
	System.out.println("Rectangle: " + rectangle.toString());
	System.out.println(rectangle.circumference());
	System.out.println(rectangle.area());
    }
}
