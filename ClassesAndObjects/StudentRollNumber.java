package ClassesAndObjects;

import java.util.Date;

 class StudentRollNumber1 {
	private String RollNumber;
	private String StName;
	private String StClass;
	private static int count=1;
	
	public StudentRollNumber1(String StName,String StClass) {
		this.StName=StName;
		this.StClass=StClass;
		// TODO Auto-generated constructor stub
		RollNumber=GetRollNum();
	}
	public static String GetRollNum() {
		Date d=new Date();
		String res= "Malla"+(d.getYear()+1900)+""+count;
		count++;
		return res;
	}
	public String getRoll() {
		return RollNumber;
	}
	public  void Result() {
		System.out.println(RollNumber+" "+" "+StName+" "+" "+StClass);
	}
}
public class StudentRollNumber{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StudentRollNumber1 r=new StudentRollNumber1("Rahul","10th");
		r.Result();
		
		StudentRollNumber1 r1=new StudentRollNumber1("Raj","11th");
		r1.Result();
		

	}

}
