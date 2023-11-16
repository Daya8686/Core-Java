package Methods;

import java.util.Scanner;

public class OverLoadMethodToReverseIntOrArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse it");
		int a =sc.nextInt();
		System.out.println(reverse(a));
		System.out.println("Enter how many digits you want to enter in array");
		int n=sc.nextInt();
		System.out.println("Enter the array elements now");
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		reverse(arr);
//		for(int i=0;i<n;i++) {
//			System.out.print( narr[i]);
//		}
	}
	static int reverse(int n) {
		
		int sav=0;
		while(n!=0) {
		int rev=n%10;
		
		sav=(sav*10)+rev;
		 n=n/10;
		}
		return sav;
	}
	static void reverse(int arr[]) {
		int revarr[]=new int[arr.length];
		for(int j=0,i=arr.length-1;i>=0;i--,j++) {
			revarr[j]=arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
				System.out.println( revarr[i]);
	}
	}

}
