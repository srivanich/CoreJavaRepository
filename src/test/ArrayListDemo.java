package test;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar1 = new ArrayList<Integer>();
		ar1.add(10);
		ar1.add(20);
		ar1.add(30);
		
		System.out.println(ar1);
		
		System.out.println(ar1.size());
		System.out.println(ar1.get(0));
		
		System.out.println("**********");
		
		Employee e1 = new Employee("vani", 23, "admin");
		Employee e2 = new Employee("rani", 24, "qa");
		Employee e3 = new Employee("nani", 25, "dev");
		
		ArrayList<Employee> ar2 = new ArrayList<Employee>();
		ar2.add(e1);
		ar2.add(e2);
		ar2.add(e3);
		
		Iterator<Employee> it = ar2.iterator();
		while(it.hasNext()){
			Employee emp = it.next();
			System.out.println(emp.name);
			System.out.println(emp.age);
			System.out.println(emp.dept);
		}
		
		System.out.println("**********");
		
		//addAll()
		ArrayList<String> ar3 = new ArrayList<String>();
		ar3.add("ALM");
		ar3.add("QTP");
		ar3.add("Slenium");
		
		ArrayList<String> ar4 = new ArrayList<String>();
		ar4.add("Java");
		ar4.add("Jenkins");
		ar4.add("Cucumber");
		
		ar3.addAll(ar4);
		
		System.out.println(ar3.size());
		for(int i=0;i<ar3.size();i++){
			System.out.println(ar3.get(i));
		}
		
		System.out.println("**********");
		
		//removeAll()
		ar3.removeAll(ar4);
		System.out.println(ar3.size());
		
		System.out.println("**********");
		
		//retainAll()
		ArrayList<String> ar5 = new ArrayList<String>();
		ar5.add("Java");
		ar5.add("QTP");
		ar5.add("Slenium");
		
		ArrayList<String> ar6 = new ArrayList<String>();
		ar6.add("Java");
		ar6.add("Jenkins");
		ar6.add("Cucumber");
		
		ar6.retainAll(ar5);
		for(int i=0;i<ar6.size();i++){
			System.out.println(ar6.get(i));
		}
		
	}

}
