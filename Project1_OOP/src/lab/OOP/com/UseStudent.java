package lab.OOP.com;

public class UseStudent {

	public static void main(String[] args) {
		Student student1 = new Student();
		/*don't need any more because input method defined 
		 * in constructor no parameter*/
		//student1.input();
		System.out.println();
		student1.output();
		
		System.out.println("-----------------");
		Student student2 = new Student();
		//student2.input();//like student1
		student2.output();	
		
		System.out.println("-----------------");
		Student student3 = new Student("Tuấn",5.5,20);
		student2.output();	
	}

}
