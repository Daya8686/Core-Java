package Generics;

public class GenericWithArray <T>{
	
	T arr[] =(T[])new Object[10];
	 int length=0;
	 
	 public void append(T v) {
		 arr[length++]=v;
	 }
	 public void display() {
		 for(int i=0;i<length;i++) {
			 System.out.println(arr[i]);
		 }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericWithArray<Integer> gen=new GenericWithArray<>();
		gen.append(10);
		gen.append(90);
		//gen.arr[0]="wdww";
		gen.append(799);
		gen.display();
		
		
	}

}
