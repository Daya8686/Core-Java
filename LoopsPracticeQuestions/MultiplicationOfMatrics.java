package LoopsPracticeQuestions;

public class MultiplicationOfMatrics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,3,4},{2,6,8},{5,9,2}};
		int b[][]= {{1,7,4},{4,7,2},{0,4,7}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				c[i][j]=0;
				for(int k=0;k<3;k++) {
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		for(int x[]:c) {
			for(int y:x) {
				System.out.print(y+" ");
			}
			System.out.println();
		}

	}

}
