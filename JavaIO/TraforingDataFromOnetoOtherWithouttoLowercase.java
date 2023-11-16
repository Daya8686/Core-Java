package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TraforingDataFromOnetoOtherWithouttoLowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/Source1.txt");
		FileOutputStream fos=new FileOutputStream("C:/Java/Source3.txt");
		int x;
		while((x=fis.read())!=-1) {
			if(x>=65 && x<=90)
				fos.write(x+32);
			else
				fos.write(x);
			
		}
		fos.close();
		fis.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		

	}
	
}
