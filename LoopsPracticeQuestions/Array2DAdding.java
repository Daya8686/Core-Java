package LoopsPracticeQuestions;

import java.util.Scanner;

public class Array2DAdding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]=new int[5][5];
		int b[][]=new int[5][5];
		int c[][]=new int[5][5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter for array a");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				a[i][j]=sc.nextInt();
			}
		}System.out.println("Enter for array b");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				b[i][j]=sc.nextInt();
			
			}
		}System.out.println("Sum of a and b");
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				c[i][j]=a[i][j] + b[i][j];
			
			}
		}
		for(int x[]:c) {
			for(int v:x) {
				System.out.println(v);
			}
		}


	}

}
