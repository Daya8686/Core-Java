package Generics;

class myarr<T>{
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


public class WildCard {
	
	public static void fun(myarr <?> obj) {  //By using <?> we can say it is wildcard means which does not have any data type with using <?> we can also directly us the same future by we can not lowerbound and upperbound that.
		
		obj.display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myarr <String> m1=new myarr<>();
		m1.append("Hi");
		m1.append("hello");
		
		myarr <Integer> m2=new myarr<>();
		m2.append(23);
		m2.append(67);
		
		fun(m1);
		fun(m2);

	}

}
