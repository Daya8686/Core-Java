package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class ObjectReadingFromTheFile1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos=new FileOutputStream("C:/Java/MyWrite1.txt");
		PrintStream p=new PrintStream(fos);
		student s=new student();
		s.rollno=10;
		s.name="raj";
		s.dept="CSE";
		p.println(s.rollno);
		p.println(s.name);
		p.println(s.dept);
		System.out.println("Added in to the file!! ");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
class student{
	int rollno;
	String name;
	String dept;
}
