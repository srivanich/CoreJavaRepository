package practice;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println(isPrimeNumber(3));

	}
	public static boolean isPrimeNumber(int num){
		
		if(num<=1){
			return false;
		}
		for (int i=2;i<num;i++){
			if(num % i == 0){
				return false;
			}
		}
		return true;
		
		
	}

}
