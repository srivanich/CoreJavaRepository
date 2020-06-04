package test;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		int x =200;
		int y = 190;
		int z = 20;
		
		if (x>y && x>z){
			System.out.println("x is largest");
		}
		else if (y>x && y>z){
			System.out.println("y is largest");
		}
		else{
			System.out.println("z is largest");
		}
		
	}

}
