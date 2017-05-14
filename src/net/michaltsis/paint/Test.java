package net.michaltsis.paint;

/**
 * Test class of the paint program.
 *
 * @author Alexis Michaltsis
 * @version 2017
 */
public class Test {
    /**
     * Method tests of Color class and the sub classes of/and the Figure class.
     * @param args
     */
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
        System.out.println();
        Drawing draw = new Drawing();
        draw.addShape(new Circle(1, 2, 10, 10));
        draw.addShape(new Ellipse(2, 3, 10, 5));
        draw.addShape(new Square(4, 5, 10, 10));
        draw.addShape(new Rectangle(6, 7, 10, 5));
        draw.addShape(new Line(8, 9, 1, 10));
        draw.addShape(new Triangle(8, 7, 10, 10));
        draw.addShape(new Polygon(10, 10, 2, 2, 3));
        draw.addShape(new Polygon(10, 10, 2, 2, 4));
        draw.addShape(new Polygon(10, 10, 2, 2, 5));
        draw.addShape(new Polygon(10, 10, 2, 2, 6));
        draw.addShape(new Polygon(10, 10, 2, 2, 8));
        draw.addShape(new Polygon(10, 10, 2, 2, 10));
        draw.addShape(new Polygon(10, 10, 2, 2, 12));
        draw.addShape(new Polygon(10, 10, 2, 2, 100));
        draw.addShape(new Polygon(10, 10, 2, 2, 1000));
        draw.addShape(new Polygon(10, 10, 2, 2, 10000));
        draw.addShape(new Polygon(10, 10, 2, 2, 100000));
        draw.addShape(new Polygon(10, 10, 2, 2, 1000000000));
        draw.addShape(new Circle(10, 10, 2, 2));
        for (int i = 0; i <= draw.getIndexCounter(); i++) {
            draw.printShape(i);
            System.out.println();
        }
        Figure polygon = new Polygon(10,10,2,2,64);
        System.out.println(polygon.x);
        System.out.println(polygon.y);
        System.out.println(polygon.a);
        System.out.println(polygon.b);
        System.out.println(polygon.n);

        System.out.println();

        Polygon polygon2 = new Polygon(10,10,2,2,64);
        System.out.println(polygon2.x);
        System.out.println(polygon2.y);
        System.out.println(polygon2.a);
        System.out.println(polygon2.b);
        System.out.println(polygon2.n);

        System.out.println();

        Figure circle = new Circle(10,10,2,2);
        System.out.println(circle.x);
        System.out.println(circle.y);
        System.out.println(circle.a);
        System.out.println(circle.b);
    }
}