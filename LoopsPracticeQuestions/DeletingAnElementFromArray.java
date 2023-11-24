package LoopsPracticeQuestions;

import java.util.Scanner;

public class DeletingAnElementFromArray {

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
		System.out.println("Enter the index you want to delete");
		int index=sc.nextInt();
		for(int i=index;i<num;i++) {
			arr[i]=arr[i+1];
		}
		for(int i:arr)
			System.out.println(i);

	}

}
