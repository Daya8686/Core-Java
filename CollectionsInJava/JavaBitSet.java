package CollectionsInJava;

import java.util.*;
public class JavaBitSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BitSet b=new BitSet();
		//In this BitSet it will be in the for of 1 and 0
		//if set() method is there then its 1 for that index
		//we can find missing number here and we can find union and we can perform AND, OR and XOR
		//Here is a example to find the missing element from the array where N is the length
		int arr[]= {1,2,3,4,6,7,8,9,10};
		int n=10;
		int res=result(arr,n);
		System.out.println(res);
		//--------------------------------------------
		//This is for AND
		BitSet b=new BitSet();
		BitSet c=new BitSet();
		b.set(1);
		b.set(3);
		b.set(6);
		b.set(7);
		
		
		c.set(1);
		c.set(3);
		c.set(6);
		c.set(0);
		c.set(8);
		
		
		b.and(c); // we get the result in b which is comparing the another BitSet
		System.out.println(b);
		

	}
	public static int result(int arr[], int n) {
		BitSet b=new BitSet();
		int countdif=n-arr.length;
		int eleMiss=0;
		for(int i:arr) {
			b.set(i-1); //In array we are giving input from 1 so the index in BitSet start at 0;
		}
		for(int i=0;i<countdif;i++) {
			eleMiss=b.nextClearBit(eleMiss);
		}
		++eleMiss; //to match with input numbers because we are getting in index format
		return eleMiss;
		
		
		
	}

}
