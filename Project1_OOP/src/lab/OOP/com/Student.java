package lab.OOP.com;

import java.util.Scanner;

public class Student {
	
	public String fullName;
	public double mark;
	public int age;
	
	public Student(){
		this.input();
	}
	
	public Student(String fullName,double mark,int age){
		this.fullName = fullName;
		this.mark = mark;
		this.age = age;
	}
	
	public void grade(){
		if(this.mark<5){
			System.out.println("Weak");
		}
		else if(this.mark<7.5){
			System.out.println("Average/Well");
		}
		else{
			System.out.println("Good/Excellent");
		}
	}
	
	public void input(){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(">> Enter full name: ");
		this.fullName = scanner.nextLine();
		System.out.print(">> Enter mark: ");
		this.mark = scanner.nextDouble();
		System.out.print(">> Enter age: ");
		this.age = scanner.nextInt();
	}
	
	public void output(){
		System.out.println(">> Full name: "+this.fullName);
		System.out.println(">> Mark: "+this.mark);
		System.out.println(">> Age: "+this.age);
		this.grade();
	}
	
}
