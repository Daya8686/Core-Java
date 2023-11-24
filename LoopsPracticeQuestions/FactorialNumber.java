package LoopsPracticeQuestions;
import java.util.Scanner;
public class FactorialNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number to which you wanna find factorial: ");
		int n=sc.nextInt();
		int fac=1;
		for(int i=1;i<=n;i++) {
			fac=fac*i;
		}
		System.out.println(fac);
	}

}
