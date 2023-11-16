package Methods;

import java.util.Scanner;

public class GCDorHCF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter to numbers for finding HCF or GCD");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int res=commenFactor(num1,num2);
		System.out.println(res);

	}
	
	public static int commenFactor(int n, int m) {
		while(n!=m) {
		if(n>m) {
			n=n-m;
		}
		else
			m=m-n;
	}
	return n;
	}
}
