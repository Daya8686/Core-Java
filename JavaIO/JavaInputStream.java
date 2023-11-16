package JavaIO;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class JavaInputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			FileInputStream fis=new FileInputStream("C:/Java/text.txt");
/*			byte b[]=new byte[fis.available()];
			fis.read(b);	
			String str=new String (b);
			System.out.println(str);  //1st method
*/ 			
/*			int x;
			do {
				x=fis.read();
				if(x!=-1)
					System.out.print((char)x);  //2nd method
			}
			while(x!=-1);
*/
			int x;
			while(( x=fis.read())!=-1) {
				System.out.print((char)x);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		

	}

}
