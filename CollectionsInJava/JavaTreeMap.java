package CollectionsInJava;


import java.util.*;
public class JavaTreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> tm=new TreeMap<>();
		//this will sort the elements as per keys
		tm.put(10,"Apple");
		tm.put(20, "Dog");
		tm.put(69,"Cat");
		tm.put(1, "pipe");
		System.out.println(tm);
		System.out.println(tm.ceilingEntry(67)); //this will give greater then or equal given
		System.out.println(tm.ceilingEntry(67).getValue());
		System.out.println(tm.getOrDefault(11, "Not there")); //This will work if the key is there then it will print the value else it will will print the default value
		System.out.println(tm.replace(69, "Cats"));
		System.out.println(tm);
		System.out.println(tm.firstKey());
		System.out.println(tm.lowerKey(11)); //it will give near key of number given less then or equal
		System.out.println(tm.lastKey());//this will give last key
		System.out.println(tm.subMap(20, 70));
		System.out.println(tm. descendingMap());
		
	}

}
