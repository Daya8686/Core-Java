package Example;

import java.util.Scanner;
public class TwoValuesInOneByte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		byte a,b,c;
		a=sc.nextByte();
		b=sc.nextByte();
		c=(byte)(a<<4);
		c=(byte)(c|b);
		System.out.println(c);
		
		System.out.println((c&0b11110000)>>4);
		System.out.println(c&0b00001111);
	}

}
