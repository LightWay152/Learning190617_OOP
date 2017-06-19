package lab.OOP.com;

public class UseRectangle {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle();
		r1.print();
		System.out.println("---------------");
		
		Rectangle r2 = new Rectangle(200, 150);
		r2.print();
		System.out.println("---------------");
		
		Rectangle r3 = new Rectangle(20,30,100,200);
		r3.print();
	}

}
