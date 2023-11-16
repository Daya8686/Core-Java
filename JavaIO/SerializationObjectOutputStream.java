package JavaIO;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationObjectOutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try { //we are using serialization with ObjectOutputStream and we are accessing the object of Student1 and sending whole object to file
		FileOutputStream fis=new FileOutputStream("C:/Java/ObjectExample.txt");
		ObjectOutputStream dos=new ObjectOutputStream(fis);
		Student1 s=new Student1();
		s.rollno=13;
		s.name="Raj";
		s.dept="CSE";
		dos.writeObject(s);
		}
		catch(IOException e) {
			e.printStackTrace();
		}

	}

}
