package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer>ll=new LinkedList<>();
		ll.add(87);
		ll.add(98); //this does have index so this can move if we want any particular index where it need to be stored
		ll.add(76);
		ll.add(0, 54);
		LinkedList<Integer> al2=new LinkedList<>(List.of(45,56,70,89,76));
		ll.addAll(1, al2);
		System.out.println(ll);
		System.out.println( ll.contains(56));
		System.out.println( ll.indexOf(56));
		al2=(LinkedList<Integer>) ll.clone();
		System.out.println(al2);
		ll.addLast(90);
		ll.addFirst(1);
		System.out.println(ll.peekFirst()); 
		System.out.println(ll.peek()); //peek or peekfirst are same
		for(Iterator<Integer> it=ll.iterator(); it.hasNext();) {
			System.out.println(it.next());
			
		}
		ll.removeLast(); //removeLast or polllast is same this will do same work
		ll.forEach(n->System.out.print(n+" "));
		System.out.println("\n");
		
		Iterator<Integer> dit= ll.descendingIterator();
		while(dit.hasNext()) {
			System.out.println(dit.next());
			
		}

	}

}
