package LoopsPracticeQuestions;

public class FindingSecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,9,4,7,5,1,2};
		int max1,max2;
		max1=max2=arr[0];
		for(int i=0;i<arr.length;i++) {
			if(max1<arr[i]) {
				max2=max1;
				max1=arr[i];
			}
			else if(max2<arr[i])
			{
				max2=arr[i];
			}
		}
		System.out.println(max2);

	}

}
