package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;



public class fromTwoFilesToOneFileByUsingSequenceInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/Source1.txt");
		FileInputStream fis2=new FileInputStream("C:/Java/Source2.txt");
		
		FileOutputStream fos=new FileOutputStream("C:/Java/Destination.txt");
		
		SequenceInputStream sis=new SequenceInputStream(fis,fis2);
		int x;
		while((x=sis.read())!=-1) {
			if(x>=65 && x<=90)
				fos.write(x+32);
			else
				fos.write(x);
		}
		}
		catch(IOException e) {
			e.printStackTrace();
			}

	}

}
