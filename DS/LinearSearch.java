package DS;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,4,9,54,7};
		int key=8;
		LinearSearch s=new LinearSearch();
		System.out.println(s.search(arr,key));

	}
	public int search(int arr[],int key) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==key) {
				return key;
			}
			
		}
		
			return -1;
	}

}
