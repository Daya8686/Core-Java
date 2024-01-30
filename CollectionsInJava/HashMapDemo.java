package CollectionsInJava;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//**** VERY IMPORTANT
		//HashMap has a fixed size which is 16 and we call them as bucket, for each bucket there will be a internally it use linkedList and from Java 8.0 they added after some threshold it will start working with Balanced Tree
		//HashMap Takes input as Key and value pare and it will show data as per the key values and will consider only unique keys and duplicate values
		//if we give same key then it will replace the value in the storage 
		//this key is stored will generate a hashCode for ever key we get a saparate hashCode for that hash code it get %16 and we get the reminder 
		//for that reminder value it will store in the any bucket from 16 bucket 
		//bucket start from 0-15 total 16 buckets
		// if after dividing with %16 we get reminder if for any value we get same reminder so it will be stored in same bucket with connecting to the old linkeList node 
		//this node contains or store Key, Value, HashCode and nextNode address
		// after getting same reminder value it will compare it with key, If the key is same for the same reminder then the value is replaced
		//if different key but same reminder value then it will link with that node and store in the form of linkedList.
		// The hashMap has O(1) timeComplexitity so most of the compaines use this.
		//HashSet internally uses HashMap it will take key from user but it will store dummy value at value place and stores in the same way.
		//From Java 8.0 they have started using Balanced Tree for much faster 
		//First it will use LinkedList after some threshold it will convert that to Balance Tree.
		
		HashMap <Integer,String> h=new HashMap<>();
		h.put(1,"Daya");
		h.put(2,"Raj");
		h.put(5,"Vinay");
		h.put(3,"Sunny");
		System.out.println(h);
		
		String name=h.get(5);
		System.out.println(name);
		System.out.println(h.remove("Vinayh")); // if the value is not there then it give null but we can't remove by string
		System.out.println(h.remove(5)); //we can remove  key or by both not with value
		System.out.println(h);
		h.put(6,"Bunny");
		h.put(9, "Sai");
		h.put(11, "Sunny");
		h.put(9, "Kumar"); //this will replace the value if there are same key
		System.out.println(h);
		//if we remove by value then value is not removed 
		
		System.out.println(h.remove("Raj"));
		System.out.println(h);
		h.containsKey(5);
		h.replace(11, "Sunny", "Gunny");
		System.out.println(h); // replace the value by old value we need to gevie key, old value and new value if the key and value are there at same then it will replacve
		
		

	}

}
