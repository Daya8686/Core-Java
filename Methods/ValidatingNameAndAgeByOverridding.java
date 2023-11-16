package Methods;

import java.util.Scanner;

public class ValidatingNameAndAgeByOverridding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		String name=sc.nextLine();
		boolean val=Validation(name);
		if(val) {
			System.out.println("Name is perfect there is no other charaters then letters");
		}
		else
			System.out.println("Issue in name");
		System.out.println("Enter Age");
		int age=sc.nextInt();
		System.out.println(Validation(age));
		

	}
	static boolean Validation(String name) {
		name=name.toLowerCase();
		if(name.matches("[a-z\\s]+")) {
			return true;
		}
		else 
			return false;
	}
	static String Validation(int age) {
		if(age>=18)
			return "Ready to vote now";
		else
			return "Not Elgible to vote";
	}

}
