package JavaIO;

import java.io.RandomAccessFile;

public class RandomAccessFileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		RandomAccessFile raf=new RandomAccessFile("C:/Java/Random.txt", "rw");
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		System.out.println(raf.getFilePointer());
		raf.write('z');
		raf.seek(2);
		//System.out.println(raf.getFilePointer());
		System.out.println((char)raf.read());
		raf.write('x');
		
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		System.out.println((char)raf.read());
		raf.seek(7);
		raf.write('T');
		raf.seek(7);
		System.out.println((char)raf.read());
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
