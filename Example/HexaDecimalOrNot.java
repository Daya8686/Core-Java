package Example;

public class HexaDecimalOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub,
		String str="234B";
		
		 boolean bl=str.matches("[0-9A-F]+");
		 System.out.println(str.matches("[0-9A-F]+"));
		 if(bl) {
			 System.out.println("the number is in hexa decimal "+str.matches("[0-9A-F]+"));
			 
		 }
		 else
			 System.out.println("not a hexa");

	}

}
