package test;

public class ReverseNumber {

	public static void main(String[] args) {
		
		long num = 12345;
		System.out.println("Given Number is:" +num);
		String str = String.valueOf(num);
		StringBuffer sb = new StringBuffer(str);
		System.out.println("Reverse Number is:" +sb.reverse());
		
		/*long num1 = 12345;
		System.out.println("Given Number is:" +num1);
		long rev = 0;
		while(num1!=0){
			rev = rev*10+num1%10;
			num1=num1/10;
		
		}
		System.out.println("Reverse Number is:" +rev);*/

	}

}
