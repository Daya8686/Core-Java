package Example;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Java";
		System.out.println(str.length());
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		String str1="  q   hfod	nnjd ";
		System.out.println(str1.trim());
		String str2="ok Java is a wonder full language";
		System.out.println(str2.substring(0,8));
		str2=str2.substring(10);
		System.out.println(str2);
		String str3="python";
		System.out.println(str.compareTo(str3));
		System.out.println(str.repeat(10));
		System.out.println(str.replace('a','u'));
		boolean b=str3.startsWith("p");
		System.out.println(b);
		System.out.println(str2.endsWith("e"));
		System.err.println("hello");
		char c=str3.charAt(4);
		System.out.println(c);
		str2="ok Java is a wonder full language";
		int num=str2.indexOf("a");
		System.out.println(num);
		int num1=str2.lastIndexOf('a');
		System.out.println(num1);
		num1=str2.indexOf('a',5);
		System.err.append(c);
		System.out.println(num1);
		str3="java";
		boolean ba=str.equals(str3);
		System.out.println(ba);
		ba=str.equalsIgnoreCase(str3);
		System.out.println(ba);
		String str4=str.valueOf("h");
		System.out.println(str4);
		
		
		

	}

}
