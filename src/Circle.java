/**
 * Die Klasse Circle (LE03).
 *
 * Eine Klasse zum Kennenlernen von Kapselung via
 * private Attributen und public Methoden.
 *
 * @author Alexis Michaltsis (michalts@th-brandenburg.de)
 * @version 1.00, 04.2017
 */
public class Circle {
    private double r; // Radius
    private double PI = Math.PI; // PI via Konstante aus Math-Klasse
    /**
     * Standardkonstruktor wird ueberschrieben. Radius wird mit 0 initialisiert.
     */
    Circle() {
	r = 0;
    }
    /**
     * Methode, welche den Umfang eines Kreises mit einem 
     * vorher gesetzten Radius zurueckgibt.
     */
    public double circumference() {
	return 2 * PI * r;
    }
    /**
     * Methode, welche die Flaeche eines Kreises mit einem
     * vorher gesetzen Radius zurueckgibt.
     */
    public double area() {
	return PI * r * r;
    }
    /**
     * Mehthode, welche den Radius, Umfang und die Flaeche eines Kreises mit 
     * einem vorher gesetzen Radius auf der Konsole ausgibt.
     */
    public void show() {
	System.out.println("Radius : " + getRadius());
	System.out.println("Umfang : " + circumference());
	System.out.println("Flaeche: " + area());
    }
    /**
     * Methode, welche einen Radius werden in einer privaten Variable speichert.
     *
     * @param r uebergebe Wert fuer Speicherung in Variable (Setter).
     */
    public void setRadius(double r) {
	this.r = r;
    }
    /**
     * Methode, welche den Wert aus einer Variablen ausliesst (Getter).
     * In diesem Fall der Radius eines Kreises.
     */
    public double getRadius() {
	return r;
    }
    /**
     * Main-Methode. Testet in diesem Fall die Klassen-Implementation Circle.
     */
    public static void main(String[] args) {
        Circle circle = new Circle(); // Neue Circle-Instanz
        circle.show(); // Test: wurde r via Konstruktor mit 0 initialisiert?
        for (int i = 1; i < 11; i++ ) { // Tests mit Werten von 1 bis 10
            circle.setRadius(i);
            circle.show();
        }
    }    
}

