package Methods;

public class RecursionPrinting321 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun(3);

	}
	static void fun(int n) {
		if(n>0) {
			System.out.println(n);
			fun(n-1);
		}
	}

}
