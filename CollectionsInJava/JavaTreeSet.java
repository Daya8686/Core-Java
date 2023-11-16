package CollectionsInJava;

import java.util.TreeSet;

public class JavaTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(34);
		ts.add(67);
		ts.add(34);
		ts.add(2);
		ts.add(4);
		ts.add(78);
		System.out.println(ts); //TreeSet is a sorted Set
		System.out.println(ts.pollFirst());
		System.out.println(ts);
		

	}

}
