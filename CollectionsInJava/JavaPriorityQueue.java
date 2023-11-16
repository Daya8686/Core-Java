package CollectionsInJava;

import java.util.Comparator;
import java.util.PriorityQueue;

//we are creating a new class for with implement comparator

class myComp implements Comparator<Integer>{
	public int compare(Integer o1,Integer o2) {
		if(o1<o2) return 1;
		if(o2<o1) return -1;
		return 0;
	}
}

public class JavaPriorityQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		
		//This PriorityQueue will by default consider high perioty to small number and low perioty for big number 
		//High periority number that is small now is removed first this works on heap datastructure and will take BinaryTree structure
		//Smaller element is shifted to top of the BT when we insert it will automatically arrange by swaping the number and by keeping small number on top head of BT
		//heap will store data in left to right 
		pq.add(10);
		pq.offer(98);
		//Offer and add will work in same mechanism
		pq.offer(32);
		pq.offer(6);
		pq.offer(9);
		pq.offer(65);
		pq.forEach(x->System.out.println(x));
		System.out.println("--------------------");
		pq.poll();
		pq.forEach(x->System.out.println(x));
		
		//if we want to do with heigh priority to greater number i.e. big number then we need to use comparator
		//we need to create a new class and implement comparator
		
		PriorityQueue<Integer> pq1=new PriorityQueue<>(new myComp());
		
		System.out.println("--------------------------");
		pq1.add(10);
		pq1.offer(98);
		//Offer and add will work in same mechanism
		pq1.offer(32);
		pq1.offer(6);
		pq1.offer(9);
		pq1.offer(65);
		pq1.forEach(x->System.out.println(x));
		System.out.println("--------------------");
		pq1.poll();
		pq1.forEach(x->System.out.println(x));
		
		
	}

}
