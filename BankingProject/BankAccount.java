package BankingProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Scanner;

public class BankAccount {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Account acc=null;
		
		HashMap<String,Account> hm=new HashMap<>();
		
		try {
		FileInputStream fis=new FileInputStream("C:\\Java\\Bank Accounts.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		
		int count=ois.readInt();
		for(int i=0;i<count;i++) {
			acc=(Account)ois.readObject();
			System.out.println(acc);
			hm.put(acc.AccountNumber, acc);
		}
		
		
		
		ois.close();
		fis.close();
		}
		catch(Exception e) {
//			e.printStackTrace();
		}
		System.out.println("for continue please enter any key");
		String any=sc.nextLine();
		try {
			FileOutputStream fos=new FileOutputStream("C:\\Java\\Bank Accounts.txt");
			ObjectOutputStream oos=new ObjectOutputStream(fos);
			
			System.out.println("Menu: ");
			
			String account,name;
			double balance;
			int choice;
			do {
				
				System.out.println("Select the option below:");
				System.out.println("-------------------------------");
				System.out.println("1.Create account");
				System.out.println("2.Delete Account");
				System.out.println("3.View Account");
				System.out.println("4.View All Accounts");
				System.out.println("5.Save Account");
				System.out.println("6.Exit");
				System.out.print("Enter the option here -----> ");
				sc.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//				int befCount=hm.size();
//				oos.writeInt(befCount);
//				for(Account x:hm.values())
//					oos.writeObject(x);
				choice=sc.nextInt();
				switch(choice) {
				
				case 1: 
					System.out.println("Account Number: ");sc.nextLine();
					account=sc.nextLine();
					
					System.out.println("Bank Holder Name: ");
					name=sc.nextLine();
					
					System.out.println("Enter Deposit Amount: ");
					balance=sc.nextDouble();
					acc=new Account(account,name,balance);
					hm.put(account, acc);
					System.out.println("-------------------------------");
					System.out.println("\u001B[32mGreen Account Created Succesfully!!");
					System.out.print("\u001B[30m");
					System.out.println("-------------------------------");
					break;
				
				case 2:
					System.err.println("Deleting Account!");
					System.out.println("Enter the account number:");
					sc.nextLine();
					account=sc.nextLine();
					hm.remove(account);
					System.out.println();
					System.out.println("-------------------------------");
					System.out.println("\u001B[32mGreen Account Deleted Succesfully!!");
					System.out.print("\u001B[30m");
					System.out.println("-------------------------------");
					break;
					
				case 3:
					System.out.println("Viewing account: ");
					System.out.println("-------------------------------");
					System.out.println("Enter the account number: ");sc.nextLine();
					account=sc.nextLine();
					acc=hm.get(account);
					System.out.println(acc);
					System.out.println("-------------------------------");
					break;
					
				case 4:
					int numbers=hm.size();
					System.out.println("All Account Details are: ");
					System.out.println("-------------------------------");
					for(Account i:hm.values()) {
						System.out.println(i);
						System.out.println("-------------------------------");
						
					}
					break;
				
				case 5:
				case 6:
						int noOfAcc=hm.size();
						oos.writeInt(noOfAcc);
						for(Account x:hm.values())
						oos.writeObject(x);
						System.out.println("-------------------------------");
						System.out.println("\u001B[32m Account Saved !!");
						System.out.print("\u001B[30m");
						break;
				default:		
				if(choice>6) {
					System.err.println("OOPS!! You have enter the wrong option. ");
				}
					break;
				}
				
			}
			while(choice!=6|| choice>6);
			oos.flush();
			oos.close();
			
			fos.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
