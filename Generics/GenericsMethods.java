package Generics;

class myArray <T>{
	T arr[]=(T[])new Object[10];
	int length=0;
	public void append(T v) {
		arr[length++]=v;
		
	}
	public void display() {
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
	}
}
public class GenericsMethods {

	public static <T> void show(T arr[]) {
		for(T x:arr) {
			System.out.println(x);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			show(new String[]{"hi","hello","bye"});
			show (new Integer[] {10,45,56,87});
	}

}
