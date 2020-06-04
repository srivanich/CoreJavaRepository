package test;

import java.util.Arrays;

public class SecondLargestOfArray {

	public static void main(String[] args) {
		
		int numbers[] = {1,90,76,94,55,45};
		
		int firstlargest = 0;
		int secondlargest = 0;
		int arraysize = numbers.length;
		
		System.out.println("Given array: "+Arrays.toString(numbers));
				
		for(int i=0;i<arraysize;i++){
			if(firstlargest<numbers[i]){
				secondlargest = firstlargest;
				firstlargest = numbers[i];
			}
			//else if(secondlargest<numbers[i]){
				//secondlargest = numbers[1];
			//}
		}
		
		System.out.println("First Largest number = "+firstlargest);
		System.out.println("Second Largest number = "+secondlargest);

	}

}
