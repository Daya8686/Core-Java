package Methods;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length and breadth for rectangle to find area");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println( area(a,b));
		System.out.println("Enter the radious to find the area of circle");
		int r=sc.nextInt();
		System.out.println(area(r));

	}
	static int area(int a, int b) {
		return a*b;
	}
	static double area(int r) {
		double a=Math.PI*r*r;
		return a;
	}
	

}
