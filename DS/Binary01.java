package DS;

public class Binary01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,6,4,9,54,7};
		int key=54;
		Binary01 s=new Binary01();
		
		int first=0;
		int last=arr.length-1;
		System.out.println(s.search(arr,key,first,last));

	}
	public int search(int arr[],int key,int first,int last) {
		int mid=(first+last)/2;
		while(first<=last) {
			if(arr[mid]<key) {
				first=mid+1;
			}
			else if(arr[mid]==key) {
				return key;
			}
			else {
				last=mid-1;
			}
			mid=(first+last)/2;
		}
		return -1;
		
		
		
	}

}
