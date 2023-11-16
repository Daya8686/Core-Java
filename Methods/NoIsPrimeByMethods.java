package Methods;

import java.util.Scanner;

public class NoIsPrimeByMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		String result=prime(num);
		System.out.println(result);

	}
	public static String prime(int n) {
		//String res="";
		for(int i=2;i<n;i++) {
			if(n%i==0) 
				return "This not a prime";
			}
			return "This is a prime";
			
		}
		
		
		
	}

