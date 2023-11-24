package LoopsPracticeQuestions;

public class RightAndLeftShiftArrayByOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//left shift array by one element
		int arr[]= {5,9,3,5,2,1,6,7};
		int temp;
		 temp=arr[0];
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		arr[arr.length-1]=temp;
		for(int i:arr)
		System.out.println(i);
		
		System.out.println("----------------------");
		int arr1[]= {5,9,3,5,2,1,6,7};
		//right shift array by one element
		temp=arr1[arr1.length-1];
		for(int i=arr1.length-1;i>0;i--) {
			arr1[i]=arr1[i-1];
		}
		arr1[0]=temp;
		for(int i:arr1)
		   System.out.println(i);
	}

}
