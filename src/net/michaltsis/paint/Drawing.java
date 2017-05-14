package net.michaltsis.paint;

import java.util.ArrayList;
import java.util.List;

/**
 * Drawing class, which operates on an ArrayList
 */
public class Drawing {
    // Fields
    private List<Figure> shapes = new ArrayList<>();
    private int indexCounter = -1;

    // Methods
    public void addShape(Figure f) {
        shapes.add(f);
        indexCounter++;
    }
    public void removeShape(int i) {
        shapes.remove(i);
        indexCounter--;
    }
    public Figure getShape(int i) {
        return shapes.get(i);
    }
    public int getIndexCounter() {
        return indexCounter;
    }
    public void printShape(int i) {
        System.out.println("Type         : " + shapes.get(i).toString());
        System.out.println("PosX         : " + shapes.get(i).getX());
        System.out.println("PosY         : " + shapes.get(i).getY());
        System.out.println("Width        : " + shapes.get(i).getWidth());
        System.out.println("Height       : " + shapes.get(i).getHeight());
        System.out.println("Circumference: " + shapes.get(i).circumference());
        System.out.println("Area         : " + shapes.get(i).area());
    }
}