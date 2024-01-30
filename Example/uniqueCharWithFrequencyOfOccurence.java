package Example;
import java.util.*;
public class uniqueCharWithFrequencyOfOccurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		uniqueCharWithFrequencyOfOccurence.process("TOMATO");

	}
	public static void process(String str) {
		Map<Character,Integer> h =new HashMap<>();
		char[]c=str.toCharArray();
		for(int i=0;i<c.length;i++) {
		if(h.get(c[i])==null) {
			h.put(c[i], 1);
		}
		else {
			int incre=h.get(c[i]);
			h.put(c[i], ++incre);
		}
		
		}
		System.out.println(h);
	}

}
