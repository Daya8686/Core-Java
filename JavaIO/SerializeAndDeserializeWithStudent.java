package JavaIO;

import java.io.*;
class Student2 implements Serializable{
	private int rollno;
	private String name;
	private float avg;
	private String dept;
	public static int stat=10;  //static and transient will not be serializable
	public transient int trans;
	
	public Student2() {
		
	}
	public Student2(int r,String n,float avg,String dept) {
		this.rollno=r;
		this.name=n;
		this.avg=avg;
		this.dept=dept;
		this.stat=500; //this will not be serialize
		this.trans=500; //this will not serialize
		
	}
	public String toString()
	{
		return"\n Roll no: "+rollno+"\nname"+name+"\naverage"+avg+"\ndepartment"+dept+"\nstat"+stat+"\ntrans"+trans;
	}
}
public class SerializeAndDeserializeWithStudent {

/*	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileOutputStream fos=new FileOutputStream("C:/Java/StudentSerial.png");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		Student2 s=new Student2(13,"kiran",12.09f,"CSE");
		oos.writeObject(s);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}*/
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		FileInputStream fis=new FileInputStream("C:/Java/StudentSerial.png"); //we can use txt i have used png
		ObjectInputStream ois=new ObjectInputStream(fis);
		Student2 s=(Student2)ois.readObject();
		System.out.println(s);
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
