package LoopsPracticeQuestions;

import java.util.Scanner;

public class InsertingArrayByIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]=new int[10];
		arr[0]=5;
		arr[1]=4;
		arr[2]=2;
		arr[3]=7;
		arr[4]=8;
		int num=5;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<num;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("Enter the index you want");
		int index=sc.nextInt();
		System.out.println("Enter the value you want to add at index"+index);
		int value=sc.nextInt();
//		for(int i=num-1;i>=index;i--) {  //method 1
//			arr[i+1]=arr[i];
//			
//		}
		for(int i=num;i<index;i--) {
			arr[i]=arr[i-1];
		}
		arr[index]=value;
		for(int n:arr)
			System.out.print(n);

	}

}
