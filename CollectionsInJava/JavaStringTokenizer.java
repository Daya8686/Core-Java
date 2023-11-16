package CollectionsInJava;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class JavaStringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stuby
		//In this StringTokenizer we are taking a String and we are using delimeter which will divide the string into tokens
		//we can take the data from files
		String s="Name=Vinay;College=MIT;City=Hyderabad;Depat=CSE";
		StringTokenizer st=new StringTokenizer(s,"=;"); // here we are using =; in String s so we need to divide it by using delimeter
		String data;
		while(st.hasMoreElements()) {
			data=st.nextToken();
			System.out.println(data);
		}
		System.out.println("--------------------------------");
		try {
		FileInputStream fis=new FileInputStream("C:\\Java\\StringTokenizerExample.txt");
		byte b[]=new byte[fis.available()];
		fis.read(b);
		String str=new String(b);
		StringTokenizer stk=new StringTokenizer(str,"-,");
		String data1;
		while(stk.hasMoreElements()) {
			data1=stk.nextToken();
			System.out.println(data1);
		}
		}
		
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
