package Example;

public class MatchingSymbols {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str="a"; //true
//		String str="b"; //true
		String str="c"; //true
//		String str="A"; //false
//		String str="z"; //false
		System.out.println(str.matches("[abc]"));
//		System.out.println(str.matches("[abcdefgh]"));
		
		String str1="."; //any one charater
		System.out.println(str.matches("A"));
		
		
	}

}
