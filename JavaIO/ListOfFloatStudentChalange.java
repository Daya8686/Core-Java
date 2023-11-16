package JavaIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

class StudentChalange{
	float list[]= {10.8f,48.9f,87.9f,34.88f};
	int size=list.length;
}

public class ListOfFloatStudentChalange {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fis=new FileOutputStream("C:/Java/StudentChalange.txt");
		DataOutputStream dos=new DataOutputStream(fis);
		StudentChalange sc=new StudentChalange();
		dos.writeInt(sc.size);
		for(int i=0;i<sc.size;i++) {
			dos.writeFloat(sc.list[i]);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}
	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/StudentChalange.txt");
		DataInputStream dos=new DataInputStream(fis);
		StudentChalange sc=new StudentChalange();
		sc.size=dos.readInt();
		for(int i=0;i<sc.size;i++) {
		sc.list[i]=dos.readFloat();
		}
		System.out.println(sc.size);
		for(float x:sc.list) {
		System.out.println(x);
		}
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
