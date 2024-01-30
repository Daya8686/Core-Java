package CollectionsInJava;

import java.util.*;
public class JavaArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayDeque<Integer> dq=new ArrayDeque<>();
		//By seeing the working model of this Deque i can say that this may work like the data is entered from center
		//offerFirst or addFirst->addFirst and addLast will throw exception if this have any exception while adding any element
		//offerFirst and offerLast will not throw any exception
		//This will work both like stack and queue and have constant time and faster then LinkedList
		//This is for stack LIFO
		
		dq.offerLast(10);
		dq.offerLast(20);
		dq.offerLast(40);
		dq.offerLast(5);
		dq.forEach(x->System.out.println(x));
		dq.pollLast();
		dq.forEach(x->System.out.println("after polllast: "+x));
		dq.offerLast(5);
		System.out.println("----------------------------------");
		
		//now like Queue FIFO
		
		dq.pollFirst();
		dq.forEach(x->System.out.println("after pollFirst like stack: "+x));
		System.out.println("----------------------------------");
		
		//This is like LIFO stack
		ArrayDeque<Integer> dq1=new ArrayDeque<>();
		dq1.offerFirst(8);
		dq1.offerFirst(3);
		dq1.offerFirst(35);
		dq1.offerFirst(90);
		dq1.offerFirst(23);
		dq1.offerFirst(78);  //---> This will become latest first
		dq1.forEach(x->System.out.println(x)); //this like stack
		dq1.pollFirst();
		System.out.println("----------------------------------");
		dq1.forEach(x->System.out.println(x));
		
		
		System.out.println("----------------------------------");
		
		dq1.pollLast(); //this work like queue now FIFO
		dq1.forEach(x->System.out.println(x));
		System.out.println("----------------------------------");
		
		dq1.offer(1000); //this will add first
		dq1.forEach(x->System.out.println(x));
		
		
		
		

	}

}
