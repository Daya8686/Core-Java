package LoopsPracticeQuestions;

public class Patten2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			
			for(int j=num-i;j>=1;j--) {
				System.out.print(" ");
			}
			for(int k=i;k>=1;k--) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
