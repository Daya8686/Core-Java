package CollectionsInJava;

import java.util.*;
public class JavaLinkedHashMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<Integer,String> lhm=new LinkedHashMap<>(5,.75f,true) {
		//In this Linked hash Map the order is Insertion order and we can define intitalCapacity, fillRatio and Order Access(boolean)
		//If we don't want to extend the given initialCapacity then we need to override a method protected boolean removeEldestEntry(Map.Entry e)
		//and need to return the size() method with the initialCapacity
		//If the value is true then the it will remove the element according to Least resent access if not then the element is removed from top
			protected boolean removeEldestEntry(Map.Entry e) {
				return  size()>5;
			}
		};
		lhm.put(54, "RT");
		lhm.put(67, "yui");
		lhm.put(56, "giu");
		lhm.put(87, "stde");
		lhm.put(34, "iug");
		System.out.println(lhm.get(67)); //this will be the least recently accessed element
		System.out.println("---------------");
		lhm.forEach((x,y)->System.out.println(x+" | "+y));
		System.out.println("---------------");
		lhm.put(98, "we");
		lhm.put(65, "hyui");
		lhm.forEach((x,y)->System.out.println(x+" "+y));
		
		//yui is most recenty accessed element so it will come down and the unaccessed elements will be deleted from the top
		//and new elements we be added to most recently as below because they are most recently accessed.
		
	}

}
