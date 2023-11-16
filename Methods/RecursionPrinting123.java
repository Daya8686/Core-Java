package Methods;

public class RecursionPrinting123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3);

	}
	static void fun(int n) {
		if(n>0) {
		fun(n-1);
		System.out.println(n);
	}}
	

}
