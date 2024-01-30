package Example;
import java.util.*;
public class uniqueCharWhichAreNotRepeat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueCharWhichAreNotRepeat.process("GeeksforGeeks");
		

	}
	
	public static void process(String str) {
		String s="";
		Map<Character,Integer> h=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			if(h.get(str.charAt(i))==null) {
				h.put((str.charAt(i)), 1);
				s+=str.charAt(i)+"";
			}
		}
		System.out.println(s);
		
	}

}
