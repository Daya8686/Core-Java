package LoopsPracticeQuestions;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=257;
		int count=0;
		int sum=0,temp;
		temp=i;
		while (i>0) {
		int num=i%10;
		System.out.println(num);
		sum=(sum*10)+num;
		i=i/10;
		count++;
		}
		System.out.println(sum);
		System.out.println("count: "+count);
	}

}
