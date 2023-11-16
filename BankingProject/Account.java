package BankingProject;

import java.io.Serializable;

public class Account implements Serializable{
	public String AccountNumber;
	private String Name;
	private double Balance;
	
	Account(){}
	Account(String a,String name,double bal){
		AccountNumber=a;
		Name=name;
		Balance=bal;
	}
	public String toString() {
		return ("Account Number: "+AccountNumber+"\nName: "+Name+"\nAccount Balance: "+Balance);
		
	}
	

}
