package CollectionsInJava;

import java.util.*;


public class JavaHashTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable ht=new Hashtable();
		//This Hashtable is a legacy which was introduced in java 1.0 and it is not from collection this is not generic
		//Hashtable is non generic and It will take all the data in the form of object
		//we need to narrow type cast it to use the values
		//This will take key and value both in the form of object
		//there is no sequence in output 
		
		ht.put(87, "Dog");
		ht.put(23, "cat");
		ht.put(98, "Gun");
		ht.put(54, "fruit");
		//here we can change the key value defination as below
		ht.compute(23, (k,v)->"Not Cat");
		ht.compute(98, (k,v)->k+" number of Guns");
		System.out.println(ht);
		ht.computeIfAbsent(88,(v)->"Orange");
		System.out.println(ht);
		String s=(String)ht.get(23); //we need to type cast it to access the value
		//to iterate there is no iterator we need to write in Enumeration
		
		Enumeration e=ht.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		//there is another HashTable which is in generic and is implements Map interface
		Hashtable<Integer, String> hss=new Hashtable<>();
		hss.put(87, "Dogs");
		hss.put(65, "Bags");
		System.out.println(hss);

	}

}
