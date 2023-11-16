package Example;

public class NumberBinaryOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b=10010101;
		String str="";
		str=str.valueOf(b);
		// or we can do to convert it to string is str=b+"";
		boolean bl=str.matches("[10]*");
		if(bl) {
			System.out.println("it is in binary format");
		}
		else {
			System.out.println("noty in binary");
		}
	}

}
