package LoopsPracticeQuestions;

import java.util.Scanner;

public class convertingNumberToStringAndDigitToWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();String st=""; 
		int temp=num;
		while(temp>0) {
		
		int rem=temp%10;
		st=st+rem; //String convertion method 1
//		st="+rem; method 2
//		st=String.valueOf(temp);
//		st=Integer.toString(temp);
		temp/=10;
		}
		int n=st.length();
		for(int i=n-1;i>=0;i--) {
			char c=st.charAt(i);
			
			switch(c) {
			
			case '1':
				System.out.print(" One ");
				break;
				
			case '2':
				System.out.print(" Two ");
				break;
				
			case '3':
				System.out.print(" Three ");
				break;
			case '4':
				System.out.print(" Four ");
				break;
				
			case '5':
				System.out.print(" Five ");
				break;
				
			case '6':
				System.out.print(" Six ");
				break;
				
			case '7':
				System.out.print(" Seven ");
				break;
				
			case '8':
				System.out.print(" Eight ");
				break;
				
			case '9':
				System.out.print(" Nine ");
				break;
				
			case 0:
				System.out.print(" Zero ");
				break;
			default :
				System.out.println("you thave entered wrong number");
			}
		}
		

	}

}
