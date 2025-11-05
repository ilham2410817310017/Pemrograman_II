package Modul05.soal1;

public class Rectangle extends Shape{
	private double length;
	private double width;
	
	public Rectangle(double l, double w) {
		super("Rectangle");
		length = l;
		width = w;
	}
	
	@Override
	public double area(){
		return this.length * this.width;
	}
	
	@Override
	public String toString() {
		return super.toString() + " dengan panjang " + length + " dan lebar " + width;
	}
}
