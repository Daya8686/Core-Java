package LoopsPracticeQuestions;

import java.util.Scanner;

public class ReverseOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= new int[10];
		System.out.println("Enter array numbers upto 10 ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i:a) {
			System.out.println(i);
		}
		//Reverse
		int b[]=new int[a.length];
		
		for(int i=a.length-1,j=0;i>=0;i--,j++) {
			
			b[j]=a[i];
			
		}
		

		for(int i:b)
		System.out.println(i);
	}

}
