package test;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Map.Entry;

public class HashTableDemo {

	public static void main(String[] args) {
		
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
		ht.put(0, "test0");
		ht.put(1, "test1");
		ht.put(2, "test2");
		
		for(Entry m : ht.entrySet()){
			System.out.println(m.getKey()+" "+m.getValue());
			System.out.println("Adding a new line from Local Repository");
			System.out.println("Adding a new line from GitHub Repository");
			System.out.println("Adding a second line from GitHub Repository");
		}
		
		Enumeration e = ht.elements();
		//System.out.println(e);
		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
		
		if(ht.containsValue("test11")){
			System.out.println(true);
		}
		else{
			System.out.println(false);
		}
		
		Hashtable<Integer, String> h = new Hashtable<Integer, String>();
		
		h = (Hashtable<Integer, String>) ht.clone();
		System.out.println(h);
		
		System.out.println("Hashcode of Hashtable-h = "+h.hashCode());
		System.out.println("Hashcode of Hashtable-ht = "+ht.hashCode());
		
		if(ht.equals(h))
			System.out.println("both are equal");
		
		System.out.println(h.get(0));
		
		ht.clear();
		System.out.println(ht);
		System.out.println(h);
		
		Hashtable<Integer, String> ht1 = new Hashtable<Integer, String>();
		ht1.put(0, "test0");
		ht1.put(1, "test1");
		ht1.put(2, "test2");
		ht1.put(2, "test2");
		System.out.println(ht1);
		
	}

}
