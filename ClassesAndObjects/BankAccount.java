package ClassesAndObjects;

import java.util.Date;

class Bank{
	private String AccountHolderName;
	private String City;
	private String AccountNumber;
	private static int count=1001;
	private final int bankCode=7878;
	
	Bank(String AccountHolderName,String City){
		this.AccountHolderName=AccountHolderName;
		this.City=City;
		AccountNumber=GetAccountNum();
	}
	
	public String GetAccountNum(){
		Date d=new Date();
		AccountNumber=""+bankCode+(d.getYear()+1900)+(count);
		count++;
		return AccountNumber;
	}
	public void Result() {
		System.out.println(AccountHolderName+" "+City+" "+AccountNumber);
	}
}

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new Bank("Ravi","Armoor");
		b.Result();
		Bank b1=new Bank("Kumar","Armoor");
		b1.Result();

	}

}
