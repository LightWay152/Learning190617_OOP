package lab.OOP.com;

import java.util.Scanner;

public class Rectangle {
	public double length;
	public double width;
	
	public Rectangle(){
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> Enter length: ");
		this.length = scanner.nextDouble();
		System.out.print(">> Enter width: ");
		this.width = scanner.nextDouble();
	}
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public Rectangle(double x1, double y1, double x2, double y2) {
		this.length = Math.abs(y1-y2);
		this.width = Math.abs(x1-x2);	
	}
	
	public double getPerimeter(){
		return 2*(width+length);
	}
	
	public double getArea(){
		return width*length;
	}
	
	public void print(){
		System.out.println(">> Length: "+this.length);
		System.out.println(">> Width: "+this.width);
		System.out.println(">> Perimeter: "+this.getPerimeter());
		System.out.println(">> Area: "+this.getArea());
	}
	
}
