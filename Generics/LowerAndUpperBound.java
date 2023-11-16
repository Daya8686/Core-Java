package Generics;

class myArrays<T>{
	T arr[]=(T[])new Object[10];
	int length=0;
	
	public void insertTo(T v) {
		arr[length++]=v;
		
	}
	public void display() {
		for(int i=0;i<length;i++) {
			System.out.println(arr[i]);
		}
	}
}



public class LowerAndUpperBound {
	
	public static void show(myArrays<? extends Number> ar) { //Upper bound number is a sub class of all numeric classes
		
		ar.display();
		
	}
	
	public static void fun(myArrays<? super Integer> ir) { //Lower bound we can use Integer and its super class for this lower bound for example: 
		//If a class A is there and Class B is extending A and Class C extending B So if we use super B then we can only use B and its super class A
		
		ir.display();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myArrays <Integer> arr=new myArrays<>();
		arr.insertTo(100);
		fun(arr);
		
		myArrays <Number> air=new myArrays(); //we can also use Integer
		air.insertTo(123);
		show(air);

	}

}
