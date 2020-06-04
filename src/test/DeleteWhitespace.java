package test;

public class DeleteWhitespace {

	
	public static void main(String[] args) {
		
		//String str[] = {"hello", "hi", "", ""};
		
		String str = " abc	defg	hijkl ";
		String s1 = str.replaceAll("\\t+", "");
		//String s2 = str.replaceAll("\\s+", "");
		//String s3 = str.trim();
		//String s4 = s3+" Hello";
		System.out.println(s1);
		
		//System.out.println(StringUtils.deleteWhitespace(str));

	}

}
