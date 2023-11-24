package LoopsPracticeQuestions;

public class IncreaseSizeOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {2,4,6,7,8};
		int b[]=new int[2*a.length];
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
		}
		a=b;
		b=null;
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		

	}

}
