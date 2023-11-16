package Example;

import java.util.Scanner;

public class BitwiseSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b;
		Scanner sc =new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println(a);
		System.out.println(b);
	}

}
