package test;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("test1");
		ll.add("test2");
		ll.add("test3");
		ll.add("test4");
		ll.add("test5");
		
		System.out.println("LinkedList items: "+ ll);
		
		ll.addFirst("test0");
		ll.addLast("test6");
		System.out.println("LinkedList items after adding: "+ ll);
		
		ll.remove(0);
		System.out.println("LinkedList items after removing: "+ ll);
		
		ll.set(0, "test1");
		System.out.println("LinkedList items after setting: "+ ll);
		
		ll.addFirst("test0");
		System.out.println("LinkedList items final: "+ ll);
		
		System.out.println(ll.get(3));
		
		ll.removeFirst();
		ll.removeLast();
		System.out.println("LinkedList items are: "+ ll);
		
		System.out.println("**********");
		
		//for loop
		
		for(int i=0;i<ll.size();i++){
			System.out.println(ll.get(i));
		}
		
		System.out.println("**********");
		
		//advanced for loop
		for(String str:ll){
			System.out.println(str);
		}
		
		System.out.println("**********");
		
		//Iterator
		Iterator<String> it = ll.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("**********");
		
		//while loop
		
		int num =0;
		while(ll.size()>num){
			System.out.println(ll.get(num));
			num++;
		}
	}

}
