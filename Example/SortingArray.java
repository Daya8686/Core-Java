package Example;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {9,4,5,2,4,6,1};
		int n=arr.length;
		int temp;
		for(int j=0;j<n-1;j++) {
		for(int i=0;i<n-1;i++) {
			if(arr[i]>arr[i+1]) {
				temp=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
		}
		for(int v:arr) {
		System.out.println(v);
		}
//		Arrays.sort(arr);
//		for(int v:arr) {
//			System.out.print(v+" ");
//			}
		
		
	}

}
