package LoopsPracticeQuestions;

public class Patten4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
				if(i+j>num)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			for(int k=i;k>1;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=num;j++) {
			if(j>i) {
				System.out.print("*");
			}
			else
				System.out.print(" ");
			}
			//System.out.println("");
		
		for(int k=1;k<=num-i-1;k++) {
			System.out.print("*");
		}System.out.println("");

		}
		
	}

}
