package JavaIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

class Customer1 implements Serializable{
	public String CustId;
	public String name;
	public String phone;
	
	
	public static int count=1;
	
	public Customer1() {
		
	}
	public Customer1(String name,String phone) {
		this.name=name;
		this.phone=phone;
		this.CustId="C"+count;
		count++;
		
	}
	public String toString() {
		return"\n name:"+name+ "\n phone"+phone+"\n Customer Id:"+CustId;
	}
	
}
public class StudentChalangeForCustomer {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		try {
//		FileOutputStream fos=new FileOutputStream("C:/Java/Customer.txt");
//		ObjectOutputStream oos=new ObjectOutputStream(fos);
//		Customer1 c[]= {new Customer1("John","9878297897"),new Customer1("Ravi","9878787524"),new Customer1("Sandeep","9753578562")};
//		oos.writeInt(c.length);
//		for(Customer1 x:c) {
//			oos.writeObject(x);
//		}
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Scanner sc=new Scanner(System.in);
		
		FileInputStream fos=new FileInputStream("C:/Java/Customer.txt");
		ObjectInputStream oos=new ObjectInputStream(fos);
		
		int length=oos.readInt();
		
		Customer1 c1[]=new Customer1[length];
		
		for(int i=0;i<length;i++) {
			c1[i]=(Customer1) oos.readObject();
			
			
		}
		
		
		System.out.println("Enter the customer name for details");
		String name=sc.nextLine();
		for(int i=0;i<length;i++) {
			if(name.equalsIgnoreCase(c1[i].name)) {
				System.out.println(c1[i]);
			}
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
