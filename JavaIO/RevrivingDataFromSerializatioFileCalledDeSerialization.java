package JavaIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class RevrivingDataFromSerializatioFileCalledDeSerialization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/ObjectExample.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student1 s;
		s=(Student1)ois.readObject();
		System.out.println(s.rollno+"\n"+s.name+"\n"+s.dept);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
