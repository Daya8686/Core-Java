package LoopsPracticeQuestions;

import java.util.Scanner;

public class PerfectnumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int perfectNumber=sc.nextInt();int pfn=0;
		for(int i=1;i<6;i++) {
			if(perfectNumber%i==0) {
				
				pfn+=i;
				System.out.println(i);
			}
		}
		System.out.println(pfn);
		if(perfectNumber==pfn) {
			System.out.println("This is perfect number");
		}
		else {
			System.out.println("not a perfect number");
		}

	}

}
