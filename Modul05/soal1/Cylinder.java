package Modul05.soal1;

public class Cylinder extends Shape{
	private double radius;
	private double height;
	
	public Cylinder(double r, double h) {
		super("Cylinder");
		radius = r;
		height = h;
	}
	
	public double area() {
		return 2 * Math.PI * radius * (height + radius);
	}
	
	public String toString() {
		return super.toString() + " dengan radius " + radius + " dan tinggi " + height;
	}
}
