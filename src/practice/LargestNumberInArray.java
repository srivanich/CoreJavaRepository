package practice;

public class LargestNumberInArray {

	public static void main(String[] args) {
		
		int numbers[] = {-100,-2,-93,-4,-885};
		int largest = numbers[0];
		int smallest = numbers[0];
		for(int i=0;i<numbers.length;i++){
			if(numbers[i]>largest){
				largest = numbers[i];
			}else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		System.out.println("largest is:" + largest);
		System.out.println("smallest is:" + smallest);

	}

}
