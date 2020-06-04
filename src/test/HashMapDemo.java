package test;

import java.util.HashMap;
import java.util.Map.Entry;


public class HashMapDemo {

	public static void main(String[] args) {
		
		//HashMap is a class that implements Map Interface
		//HashMap is a class that extends AbstarctMap
		//it contains only unique elements
		//stores the values as key value pairs
		//it may have only one null key and multiple null values
		//it maintains no order
		//HM is non synchronized, not thread safe
		//concurrent modification exception--fail fast condition
		
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(0, "test0");
		hm.put(1, "test1");
		hm.put(2, "test2");
		hm.put(3, "test3");
		
		System.out.println(hm.get(0));
		
		for(Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		hm.remove(0);
		
		System.out.println("*********************");
		
		for(Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		//hm.clone();
		hm.clear();
		for(Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("*********************");
		
		hm.put(0, "value");
		for(Entry m : hm.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
		}
		
		System.out.println("*********************");
		
		hm.put(0, "test0");
		hm.put(1, "test1");
		hm.put(2, "test2");
		hm.put(3, "test3");
		
		System.out.println(hm);
		System.out.println(hm.get(1));
		
		System.out.println("*********************");
		
		HashMap<Integer, Employee> hm1 = new HashMap<Integer, Employee>();
		
		Employee e1 = new Employee("vani", 23, "admin");
		Employee e2 = new Employee("rani", 24, "qa");
		Employee e3 = new Employee("nani", 25, "dev");
		
		hm1.put(1, e1);
		hm1.put(2, e2);
		hm1.put(3, e3);
		
		for(Entry<Integer, Employee> m : hm1.entrySet()){
			int key = m.getKey();
			Employee e = m.getValue();
			System.out.println("---Employee "+key+" Info---");
			System.out.println(e.name+" "+e.age+" "+e.dept);
		}

	}

}
