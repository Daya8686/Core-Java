package JavaIO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaWriter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		try {
//		FileWriter fw =new FileWriter("C:/Java/text1.txt");
//		String str="This is from FileWriter";
//		byte [] b=str.getBytes();
//		fw.write(b);
//		}
//		catch(IOException e) {
//			e.printStackTrace();
//		}
		try {
		FileReader fr=new FileReader("C:/Java/text1.txt");
		int x;
		while((x=fr.read())!=-1) {
			System.out.println((char)x);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}

}
