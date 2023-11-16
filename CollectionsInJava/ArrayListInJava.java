package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> al=new ArrayList<>();
		al.add(98); //this does have index so this can move if we want any particular index wher it need to be stored
		al.add(76);
		al.add(0, 54);
		ArrayList<Integer> al2=new ArrayList<>(List.of(45,56,70,89,76));
		al.addAll(1, al2);
		
		System.out.println(al);
		System.out.println( al.contains(56));
		System.out.println( al.indexOf(56));
		al2=(ArrayList<Integer>) al.clone();
		System.out.println(al2);
		System.out.println(al.clone());
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+", ");
		}
		System.out.println();
		for(Integer x:al) {
			System.out.println("From ForEach "+x);
		}
		Iterator<Integer> it= al.iterator();
		while(it.hasNext()) {
			System.out.println("From iterator while:" +it.next());
		}
		for(Iterator <Integer> its=al.iterator(); its.hasNext();) {
			System.out.println("From iterator for: "+its.next());
		}
		al.forEach(n->System.out.println(n)); //lamda expression
		System.out.println("----------------");
		al.forEach(System.out::println);
		
		System.out.println("+++++++++++");
		al.forEach(n->funct(n)); //lamda expression
		
		

	}
	public static void funct(int n) {
		if(n>60)
			System.out.println(n);
	}

}
