package LoopsPracticeQuestions;

public class StarAndSpacePatten {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=5;
		for(int i=1;i<=num;i++) {
			for(int j=i;j>1;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=num-i;k++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
