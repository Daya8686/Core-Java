package Example;

import java.util.ArrayList;
import java.util.Arrays;

public class UniqueChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="TOMATO";
		char c[]=a.toCharArray();
		Arrays.sort(c);
//		int [] ar=new int[c.length];
		ArrayList<Character> ar=new ArrayList<>();
		for(int i=0;i<a.length()-1;i++) {
			if(c[i]==c[i+1]) {
				ar.add(c[i]);
				i=i+1;
			}
			else {
				ar.add(c[i]);
			}
		}
		for(char v:ar) {
			System.out.println(v);
		}

	}

}
