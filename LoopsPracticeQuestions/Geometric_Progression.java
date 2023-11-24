package LoopsPracticeQuestions;

import java.util.Scanner;

public class Geometric_Progression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the difference number");
		int diff=sc.nextInt();
		System.out.println("enter how many numbers you want to get in input");
		int nums=sc.nextInt();
		System.out.println("Enter the number from which you want to start");
		int n=sc.nextInt();
		for(int i=1;i<nums;i++) {
			n=diff*n;
			System.out.println(n);
		}

	}

}
