package JavaIO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class BufferInputAndReader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/Source1.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		
		//by using buffer we can do the all process which we can c=do with the FileInputStream
//		int x;
//		while((x=bis.read())!=-1){
//			System.out.print((char)x);
//			
//		}
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.mark(10);
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		bis.reset();
		System.out.print((char)bis.read());
		System.out.print((char)bis.read());
		
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		//we can use Buffered stream 
		try {
		
		FileReader fr=new FileReader("C:/Java/Source1.txt");
		BufferedReader br=new BufferedReader(fr);
		
//		int x;
//		while((x=br.read())!=-1){
//			System.out.print((char)x);
//			
//		}
		
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.mark(10);
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		br.reset();
		System.out.print((char)br.read());
		System.out.print((char)br.read());
		
		System.out.println(br.readLine());
		
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		

	}

}
