package DS;

public class BinaryRecursion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,4,9,54,7};
		int key=10;
		BinaryRecursion s=new BinaryRecursion();
		
		int first=0;
		int last=arr.length-1;
		System.out.println(s.search(arr,key,first,last));
	}
	
	public int search(int arr[],int key,int first,int last) {
		int mid=(first+last)/2;
		if(first<=last) {
			if(arr[mid]==key) {
				return key;
			}
			else if(arr[mid]<key) {
				
				return search(arr,key,mid+1,last);
			}
			else {
				return search(arr,key,first,mid-1);
			}
			
		}
		return -1;
	}
}
