package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class TransforingDataFromOneFileToAnother {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		try {
		FileInputStream fis=new FileInputStream("C:/Java/Source1.txt");
		byte b[]=new byte[fis.available()];
		fis.read(b);
		str=new String(b);
		System.out.println(str);
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			FileOutputStream fos=new FileOutputStream("C:/Java/Source2.txt");
			str=str.toLowerCase();
			fos.write(str.getBytes());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
