package lab.OOP.com;

public class MinInArray {

	public static void main(String[] args) {
		double[] array = {5,6,8,2,3,9};
		int index = min(array);
		System.out.println(index);
		
		int sumEven = getSumEven(array);
		System.out.println(sumEven);
	}

	private static int getSumEven(double[] array) {
		int sumEven = 0;
		for(int i=1;i<array.length;i++){
			if(array[i]%2==0){
				sumEven += array[i];
			}
		}
		return sumEven;
	}

	private static int min(double[] array) {
		double min = array[0];
		int index = 0;
		for(int i=1;i<array.length;i++){
			if(array[i]<min){
				min = array[i];
				index = i;
			}
		}
		return index;
	}

	
}
