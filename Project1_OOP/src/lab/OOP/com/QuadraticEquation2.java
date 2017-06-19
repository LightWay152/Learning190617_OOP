package lab.OOP.com;

import java.util.Scanner;

public class QuadraticEquation2 {
	
	public double a;
	public double b;
	public double c;
	
	public QuadraticEquation2(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public QuadraticEquation2() {
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> Enter a: ");
		this.a = scanner.nextDouble();
		System.out.print(">> Enter b: ");
		this.b = scanner.nextDouble();
		System.out.print(">> Enter c: ");
		this.c = scanner.nextDouble();
	}
	
	public double getDelta(){
		double delta = Math.pow(b, 2)-(4*a*c);
		return delta;
	}
	
	public double getX1(){
		double x1 = (-b+Math.sqrt(getDelta())/2*a);
		return x1;
	}
	
	public double getX2(){
		double x2 = (-b-Math.sqrt(getDelta())/2*a);
		return x2;
	}
	
	public void solveEquation(){
		double delta = getDelta();
		if(delta<0){
			System.out.println("No solution!");
		}
		else if(delta==0){
			System.out.println("Dual solution X = "+getX1());
		}
		else{
			System.out.println("There are 2 different solutions: ");
			System.out.println("Solution X1 = "+getX1());
			System.out.println("Solution X2 = "+getX2());
		}
	}
	
}
