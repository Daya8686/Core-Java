package com.ABCTravel;

import java.io.Serializable;

public class UserData implements Serializable{
	private String firstname;
	private String secondName;
	private String MobileNumber;
	private String Gender;
	private String Email;
	private String password;
	static int failCount=5;
	private String accountStatus;
	
	
	private UserData(){
		
	}
	
	static UserData user=new UserData();
	
	public static UserData getInstance() {
		return user;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAccountStatus() {
		return accountStatus;
	}

	public void setAccountStatus(String accountStatus) {
		this.accountStatus = accountStatus;
	}

	public static UserData getUser() {
		return user;
	}

	public static void setUser(UserData user) {
		UserData.user = user;
	}

}
