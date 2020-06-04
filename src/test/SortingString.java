package test;

import java.util.Arrays;

public class SortingString {

	public static void main(String[] args) {

		String[] array = {"vani", "vamshi", "viha"};
		System.out.println("Unsorted list of string array:"+ Arrays.toString(array));
		Arrays.sort(array);
		System.out.println("Sorted list of string array:"+ Arrays.toString(array));
	}

}
