package Example;

public class NewExample {
	int a;
	static int x;
	public NewExample(int a,char c) {
		// TODO Auto-generated constructor stub
		 x=a;
		this.a=a;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NewExample n =new NewExample(10, 'c');
	System.out.println(n.a);
	System.out.println(n.x);
	}

}
