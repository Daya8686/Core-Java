package LoopsPracticeQuestions;
import java.util.*;
public class AmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int count=0,num=sc.nextInt(),temp,tot = 0;
		int num1=num;
		while(num1>0) {
		num1=num1/10;
		count++;
		}
		temp=num;
		while(temp>0) {
		int rem=temp%10;
//		int sum=0;
//		sum=(sum*10)+rem;
		 tot+=Math.pow(rem, count);
		 
		temp=temp/10;
		
		}
		if(tot==num) {
		System.out.println("its a amstrong");
		}
		else
			System.out.println("Its not amstrong");

	}

}
