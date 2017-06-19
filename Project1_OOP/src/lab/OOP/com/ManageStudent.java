package lab.OOP.com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ManageStudent {

	static Scanner scanner = new Scanner(System.in);
	static Student[] arr = new Student[5];
	
	public static void main(String[] args) {
		while(true){
			menu();
		}	
	}

	private static void menu() {
		System.out.println("Manage Student");
		System.out.println("1. Input");
		System.out.println("2. Sort");
		System.out.println("3. Output");
		System.out.println("4. Exit");
		
		System.out.print(">> Choose the option? ");
		int choose = scanner.nextInt();
		switch(choose){
		case 1:
			input();
			break;
		case 2:
			sort();
			break;
		case 3:
			output();
			break;
		case 4:
			System.exit(0);			
			break;
		default:
			System.err.println("Please choose the option again!");
		}
	}

	private static void sort() {
		Arrays.sort(arr,new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				/*Note:
				 * - If return = 1 -> o1 > o2
				 * - If return = 0 -> o1 = o2
				 * - If return = -1 -> o1 < o2
				 * */
				if(o1.mark > o2.mark){
					return 1;
				}
				else if(o1.mark < o2.mark){
					return -1;
				}
				else{
					return 0;
				}			
			}
		});
	}

	private static void output() {
		for(Student stu : arr){
			stu.output();
		}
	}

	private static void input() {
		for(int i=0;i<arr.length;i++){
			arr[i] = new Student();
		}
	}

}
