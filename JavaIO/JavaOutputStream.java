package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class JavaOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			FileOutputStream fos=new FileOutputStream("C:/Java/text01.txt");
			String str="This is a java program";
			try {
				fos.write(str.getBytes()); //1st method
				fos.write("\n".getBytes()); // for new line we can directly use " " with .getBytes()
				
				byte [] b=str.getBytes();
				fos.write(b);// second method
				fos.write("\n".getBytes()); 
				
				fos.write(b, 10, str.length()-10); //3rd method
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
