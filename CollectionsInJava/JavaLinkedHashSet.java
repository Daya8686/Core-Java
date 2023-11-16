package CollectionsInJava;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class JavaLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<Integer> hs=new LinkedHashSet<>();
		//In this LinkedHashSet we can It will store the elements as per the insertion order
		//but just HashSet will be in sorted order.
		hs.add(34);
		hs.add(65);
		hs.add(12);
		hs.add(45);
		hs.add(76);
		Iterator<Integer> it=hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
