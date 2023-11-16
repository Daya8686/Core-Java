package JavaIO;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class ObjectReaderFromTheFile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/MyWrite1.txt");
		BufferedReader br=new BufferedReader(new InputStreamReader(fis));
		student s=new student();
		s.rollno=Integer.parseInt(br.readLine());
		s.name=br.readLine();
		s.dept=br.readLine();
		System.out.println(s.rollno);
		System.out.println(s.name);
		System.out.println(s.dept);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
