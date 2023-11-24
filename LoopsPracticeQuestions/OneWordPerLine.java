package LoopsPracticeQuestions;

import java.util.Scanner;

public class OneWordPerLine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String sr=sc.nextLine();
		String[] str=sr.split(" ");
		for(int i=0;i<str.length;i++) {
			System.out.println(str[i]);
		}

	}

}
