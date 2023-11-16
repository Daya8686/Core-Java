package JavaIO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileReader fr=new FileReader("C:/Java/text.txt");
			
			int x;
			do {
				x=fr.read();
				System.out.print((char)x);
			}
			while(x!=-1);
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
