
package Methods;

public class FindMaxElementInAnArray {
	public static void main(String[] args) {
		int arr[]= {3,4,8,6,7,0};
		int res=maxArr(arr);
		System.out.println(res);
	}
	public static int maxArr(int a[]) {
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}
		}
		return max;
	}

}
