package JavaIO;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DataOutputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/DataInputStreamDile.txt"); //need to write file but written Dile
		DataInputStream dis=new DataInputStream(fis);
		student s=new student();
		s.rollno=dis.readInt();
		s.name=dis.readUTF();
		s.dept=dis.readUTF();
		System.out.println("Roll no:"+s.rollno);
		System.out.println("Name:"+s.name);
		System.out.println("Dept:"+s.dept);
		}
		catch(IOException e) {
			
		}
	}

}
