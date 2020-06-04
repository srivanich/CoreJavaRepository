package test;

import java.util.Arrays;

public class LargestNumberInArray {

	public static void main(String[] args) {
		int numbers[] = {1,2,3,4,-5,45};
		
		int largest = numbers[0];
		int smallest = numbers[0];
		int arraysize = numbers.length;
		
		System.out.println("Given array: "+Arrays.toString(numbers));
		System.out.println("Array size = "+arraysize);
		
		for(int i=1;i<arraysize;i++){
			if(numbers[i]>largest){
				largest = numbers[i];
			}
			else if(numbers[i]<smallest){
				smallest = numbers[i];
			}
		}
		
		System.out.println("Largest = "+largest);
		System.out.println("Smallest = "+smallest);
	}

}
