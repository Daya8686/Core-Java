package JavaIO;


import java.io.*;
import java.io.IOException;

public class DataInputStreamExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fis=new FileOutputStream("C:/Java/DataInputStreamDile.txt");
		DataOutputStream dis=new DataOutputStream(fis);
		student s=new student();
		s.rollno=56;
		s.name="Vinay";
		s.dept="CSE";
		dis.writeInt(s.rollno);
		dis.writeUTF(s.name);
		dis.writeUTF(s.dept);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
