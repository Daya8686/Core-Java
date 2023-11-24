package LoopsPracticeQuestions;
import java.util.Scanner;
public class MultiplicationTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter which multiplication table you want: ");
		int num=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int sum=num*i;
			System.out.println(num+" x "+i+" = "+sum);
			
		}

	}

}
