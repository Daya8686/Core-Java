package LoopsPracticeQuestions;

public class Pattens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			for(int k=num-i;k>=1;k--) {
				System.out.print("! ");
			}
			System.out.println("");
		}
	}

}
