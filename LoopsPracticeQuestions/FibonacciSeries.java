package LoopsPracticeQuestions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num1=0;
		int num2=1;
		int temp=0;
//		for(int i=0;i<10;i++) {
//			temp=num2;
//			System.out.println(num1); //method one
//			num2=num1+num2;
//			num1=temp;
//			
//		}
//		System.out.println(num1+""+num2);
		for(int i=0;i<10;i++) {
			
			temp=num1+num2;
			System.out.println(num1);
			num1=num2;
			num2=temp;
		}
	}

}
