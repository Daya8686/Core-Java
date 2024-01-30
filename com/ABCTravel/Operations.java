package com.ABCTravel;

import java.util.*;
import java.io.*;
import java.text.*;
public class Operations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserData user=UserData.getInstance();
		TravelDetails td=new TravelDetails();
		PricingList pl=new PricingList();
		CustBills cb=new CustBills();
		SeatsAvailable sa=new SeatsAvailable();
		boolean exit=true;
		
		System.out.println("ABC Travels");
		System.out.println("Welocome to world class bus bookings site!!");
		Scanner sc=new Scanner(System.in);
		int choice = 0;
		HashMap<String , UserData> hm=new HashMap<>();
		HashMap<String, TravelDetails> hd=new HashMap<>();
		HashMap<String,CustBills> hc=new HashMap<>();
		
//	System.out.println(	hp.get("hyderabadbangalore"));
		
		HashMap<String,Integer> hp=pl.prices();
		HashMap<String,Integer> hs=sa.seats();
		
		String fname="",lname="",mobile="",gender="",mail="",password="";
		int Count=user.failCount;
//		Count=1;
		
		
		try {
			 FileInputStream fis=new FileInputStream("C:\\Java\\ABC Customers.txt");
			 ObjectInputStream ois=new ObjectInputStream(fis);
			 int custCount=ois.readInt();
			 for(int i=0;i<custCount;i++) {
				 user=(UserData)ois.readObject();
				 hm.put(user.getEmail(),user);
			 }
			 ois.close();
			 fis.close();
			 FileInputStream fid=new FileInputStream("C:\\Java\\ABC Tours.txt");
			 ObjectInputStream oid=new ObjectInputStream(fid);
			 int tourCount=oid.readInt();
			 for(int i=0;i<tourCount;i++) {
				 td=(TravelDetails)oid.readObject();
				 hd.put(td.getMail(), td);
			 }
			 FileInputStream fibill=new FileInputStream("C:\\Java\\ABC Customer Bills.txt");
			 ObjectInputStream oibill=new ObjectInputStream(fibill);
			 int billCount=oibill.readInt();
			 for(int i=0;i<billCount;i++) {
				 cb=(CustBills)oibill.readObject();
				 hc.put(cb.getCustMail(), cb);
			 }
			 
		while(exit) {
			
			
			System.out.println("1-Register");
			System.out.println("2-Login");
			System.out.println("3-Exit");
			System.out.println("Enter your choice here: ");
			
			
			choice =sc.nextInt();
			
			
			switch(choice){
			case 1:
				UserData user1=UserData.getInstance();
				System.out.println("Registeration");
				System.out.println("Enter your first name:");
				sc.nextLine();
				fname=sc.nextLine();
				
				user1.setFirstname(fname);
				System.out.println("Enter your last name: ");
				
				lname=sc.nextLine();
				
				user1.setSecondName(lname);
				System.out.println("Enter mobile  number:");
				
				
				boolean mobileTrue=true;
				while(mobileTrue) {
					mobile=sc.nextLine();
				if(mobile.length()>9&& mobile.length()<=10&& mobile.matches("[0-9]{10}")) {
					user1.setMobileNumber(mobile);
					mobileTrue=false;
				}
				else {
					System.out.println("Wrong mobile number entered");
					System.out.println("Please enter again");
				}
				}
				
				System.out.println("Enter you gender Male/Female:");
				
				
				boolean genderTrue=true;
				while(genderTrue) {
					gender=sc.nextLine();
				if("Male".equalsIgnoreCase(gender)|| "Female".equalsIgnoreCase(gender)) {
				user1.setGender(gender);
				genderTrue=false;
				}
				else {
					System.out.println("You are not entered correct gender!! ");
					System.out.println("Please enter again");
				}
				}
				
				System.out.println("Enter you mail");
				boolean mailTrue=true;
				while(mailTrue) {
				mail=sc.nextLine();
				if(mail.contains("@")&& mail.contains(".")&&mail.contains("com")) {
//				int atTheRate=mail.indexOf("@");
					
				int dot=mail.lastIndexOf(".");
//				mail.indexOf("com",dot);
					if(mail.indexOf(".")==mail.lastIndexOf(".") && mail.indexOf("com")>dot&& mail.indexOf("com")==mail.lastIndexOf("com")) {
						user1.setEmail(mail);
						mailTrue=false;
					}
					else if(mail.indexOf(".")!=mail.lastIndexOf(".")&&mail.indexOf("com")>dot && mail.indexOf("com")==mail.lastIndexOf("com")) {
						user1.setEmail(mail);
						mailTrue=false;
					}
					else {
						System.out.println("Entered wrong mail id");
						System.out.println("Please enter again");
					}
				}
				else {
					System.out.println("Mail must contain '@ ','. ','com ' for example: example@gmail.com or example.2@gmail.com");
				}
				}
				TravelDetails td1=new TravelDetails();
				CustBills cb1=new CustBills();
				td1.setMail(mail);
				cb1.setCustMail(mail);
				
				System.out.println("Password must contains at least a upper case letter and lower case letter and a digit with min 8-16 characters");
				boolean passTrue=true;
				while(passTrue) {
				System.out.println("Enter your password:");
				password=sc.nextLine();
				System.out.println("Confirm password");
				String confirmPass=sc.nextLine();
				if(password.equals(confirmPass)) {
					if(password.matches("^(?=.*[A-Z])(?=.*[a-z]{7})(?=.*[0-9]).{8,16}$")) {
						user1.setPassword(password);
						passTrue=false;
					}
					else {
						System.out.println("Enter wrong password format :(");
					}
				}
				else {
					System.out.println("Password and Confirm password does not match");
				}
				}
				
				
				System.out.println(fname+ " "+lname+" "+mobile+" "+mail+" "+password);
				
				user1.setAccountStatus("Active");
				hm.put(mail,user1);
				hd.put(mail, td1);
				hc.put(mail, cb1);
				FileOutputStream fos=new FileOutputStream("C:\\Java\\ABC Customers.txt");
				ObjectOutputStream oos=new ObjectOutputStream(fos);
				
				oos.writeInt(hm.size());
				
				for(UserData d:hm.values()) {
					oos.writeObject(d);
				}
				
				System.out.println("Registered Successfully!!");
				break;
				
			case 2:
				System.out.println("Login: ");
				System.out.println("Enter your Email here:");
				sc.nextLine();
				mail=sc.nextLine();
				
				System.out.println("Enter Password:");
				
				password=sc.nextLine();
			try {
				user=hm.get(mail);
				System.out.println(user.getPassword());
			}
			catch(Exception e) {
				System.out.println("User not exits");
				
			}

				try {
				
				if(user.getEmail().equalsIgnoreCase(mail) && user.getPassword().equals(password) && user.getAccountStatus().equalsIgnoreCase("Active")) {
					System.out.println("Logged in Successfully");
					CustBills bookc=new CustBills();
					TravelDetails travel=new TravelDetails();
					
					bookc=hc.get(mail);
					bookc.setCustMail(mail);
					

					travel=hd.get(mail);
					travel.setMail(mail);
					
					hc.put(mail, bookc);
					hd.put(mail, travel);
					
					int innerChoice=0;
					boolean out=true;
					while(out) {
						System.out.println("1-Plan Journy");
						System.out.println("2-Bill");
						System.out.println("3-Reschedul booking");
						System.out.println("4-Change password");
						System.out.println("5-Edit Info");
						System.out.println("6-Save & Exit");
						System.out.println("Enter your option: ");
						innerChoice=sc.nextInt();
						String source="";
						String destination="";
						Date dt=null;
						String form="";
						int seat=0;
						
						SimpleDateFormat s=new SimpleDateFormat("dd/MM/yyyy");
//						SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
//						Date date=new Date();
//						 s.format(date);
					
						switch(innerChoice) {
						case 1:
							CustBills bookcust=hc.get(mail);
							TravelDetails trav=hd.get(mail);
							SeatsAvailable ss=new SeatsAvailable();
							System.out.println("Journy Planning page!!");
							System.out.println();
							System.out.println("Welcome to ABC Travels :) Best travel site in world");
							System.out.println();
							System.out.println("Enter your Source Location: ");
							int finalPrice=0;
							sc.nextLine();
							source=sc.nextLine();
							String sourceR=source.toLowerCase();
							trav.setSource(sourceR);
							System.out.println("Enter your Destination Locattion");
							destination=sc.nextLine();
							String destinationR=destination.toLowerCase();
							trav.setDestination(destinationR);
							String target=sourceR+destinationR;
//							String targConv=target.toLowerCase();
							System.out.println("Enter date of journy");
							System.out.println("DD/MM/YYYY ----- ex: 01/01/2024");
														form=sc.nextLine();
							dt=s.parse(form);
							
							String finalBookDate=s.format(dt);
							String todays=s.format(new Date());
							Date today=s.parse(todays);
							if(dt.after(today)||todays.compareTo(finalBookDate)==0) {
								trav.setDate(dt);
							}
							else {
								System.out.println("wrong selected date");
								System.exit(0);
								
							}
							

							if(hp.containsKey(target)) {
								int seatsAvailable= hs.get(target);
								System.out.println("Select tour seat/seats");
								System.out.println("Total no of seats Available in this root is "+seatsAvailable);
								seat=sc.nextInt();
								boolean seatBool=true;
								while(seatBool) {
								if(seat<=0&&seat>seatsAvailable) {
									System.out.println("Invalid seat selection!! or No of seats you selected are not available");
									
								}
								else {
									int updateSeats=seatsAvailable-seat;
									hs.put(target, updateSeats);
									
									bookcust.setSeat(seat);
									seatBool=false;
									System.out.println("Seat/Seats selected correctly  :)");
									if(updateSeats>1) {
									System.out.println("More "+updateSeats+"seats are available!! ");
								}
									else {
										System.out.println("Only 1 seat is available ");
									}

									System.out.println("Hurry Up");
								}
								}
								bookcust.setCustMail(mail);
								bookcust.setDate(dt);
								bookcust.setFname(user.getFirstname());
								bookcust.setLname(user.getSecondName());
								bookcust.setSource(sourceR);
								bookcust.setDestination(destinationR);
								bookcust.setMobile(user.getMobileNumber());
								bookcust.setGender(user.getGender());
								
								s.applyPattern("EEE");
								String str=s.format(dt);
								if(str.equalsIgnoreCase("sat")||str.equalsIgnoreCase("sun")) {
								int priceChange=200+hp.get(target);
								finalPrice=(priceChange*(1+(bookcust.GST)/100));
								bookcust.setPrice(finalPrice);
								}
								else {
									int regPrice=hp.get(target);
									finalPrice=(regPrice*(1+(bookcust.GST)/100)*(seat));
									bookcust.setPrice(finalPrice);
								}
							hc.put(mail, bookcust);
							hd.put(mail,trav);
							ss.setSeats(hs);
							}
							else {
								System.out.println("Selected root is not in our scope!!! \n Sorry :(");
							}
							
							System.out.println("	BOOKINGH SUCCESSFULLY COMPLETED!!!		");
							System.out.println("*****Please click 2 for your Bill*****");
//							innerChoice=4;
							break;
//							System.exit(0);
						case 2:
							CustBills c=hc.get(mail);
							
							System.out.println("			ABC Travel Bill			");
							System.out.println();
							System.out.println("----------------------------------------------------------------------");
							System.out.println("                                                   Date: "+c.getDate());
							System.out.println("Customer Name: "+c.getFname()+" "+c.getLname());
							System.out.println("Gender: "+c.getGender());
							System.out.println("Mobile number: +91 "+c.getMobile());
							System.out.println("Email ID: "+c.getCustMail());
							System.out.println("----------------------------------------------------------------------");
							System.out.println("Source Location: "+c.getSource()+" to "+"Destination: "+c.getDestination());
							System.out.println("Location Code: ABC "+(c.getSource()+c.getDestination()).hashCode());
							System.out.println("Number of seats selected: "+c.getSeat());
							System.out.println("--------------|----------|---------------------------------------");
							System.out.println("GST percentage: (+)"+c.GST);
							System.out.println("Total Price: "+c.getPrice());
							break;
							
						case 3:
							CustBills RSC=hc.get(mail);
							TravelDetails TRS=hd.get(mail);
							System.out.println("Welcome to Reschedul date point ");
							System.out.println("Old Date you selected--->"+RSC.getDate());
							System.out.println("From "+RSC.getSource()+":::::> To "+RSC.getDestination());
							System.out.println("Total no of seats "+RSC.getSeat());
							if(RSC.getDate()==null) {
								System.out.println("You haven't booked any thing");
							}
							else {
							System.out.println("Enter the date you want to Reschedule: ");
							System.out.println("DD/MM/YYYY ----- ex: 01/01/2024");
							sc.nextLine();
							String res=sc.nextLine();
							Date re_dt=s.parse(res);
							
							
							String finalBookDateRe=s.format(re_dt);
							String todaysRe=s.format(new Date());
							Date tod=s.parse(todaysRe);
							if(re_dt.after(tod)||todaysRe.compareTo(finalBookDateRe)==0) {
								TRS.setDate(re_dt);
								RSC.setDate(re_dt);
								System.out.println("RESCHEDULED SUCCESFULLY !!");
							}
							else {
								System.out.println("wrong selected date");
								System.exit(0);
								
							}
							
							hc.put(mail, RSC);
							hd.put(mail, TRS);
							}
							break;
						case 4:
							UserData passUser=UserData.getInstance();
							System.out.println("Change password");
							boolean changePassTrue=true;
							while(changePassTrue) {
							System.out.println("Password must contains at least a upper case letter and lower case letter and a digit with min 8-16 characters");
							System.out.println("Enter your password");
							sc.nextLine();
							String pass1=sc.nextLine();
							System.out.println("Enter conform password");
							String pass2=sc.nextLine();
						if(pass1.equals(pass2)) {
							passUser=hm.get(mail);
							String oldPass=passUser.getPassword();
							if(oldPass.equals(pass1)) {
								System.err.println("Old and New Passwords are same");
							}
							else {
								if(pass1.matches("^(?=.*[A-Z])(?=.*[a-z]{7})(?=.*[0-9]).{8,16}$")) {
								passUser.setPassword(pass1);
								hm.put(mail, passUser);
								changePassTrue=false;
								System.out.println("To save password click 6 in menu");
								}
								else {
								System.out.println("Entered password is not in correct format");
								}
							}
							}else {
								System.out.println("Password does not matches with conform password!!");
							}
							}
							break;
							
						case 5: 
							user=hm.get(mail);
							String newEmail=null;
							System.out.println("Edit your details now!");
							System.out.println("-------------------------------");
							System.out.println();
							System.out.print("Enter your new first name:");
							sc.nextLine();
							String newFName=sc.nextLine();
							user.setFirstname(newFName);
							System.out.print("Enter your new last name:");
							String newLName=sc.nextLine();
							user.setSecondName(newLName);
							
							System.out.println("Enter your new mobile number:");
							
							
							boolean mobTrue=true;
							while(mobTrue) {
							String newMobile=sc.nextLine();
							if(newMobile.length()>9&&newMobile.length()<=10&& newMobile.matches("[0-9]{10}")) {
								user.setMobileNumber(newMobile);
								
								mobTrue=false;
							}
							else {
								System.out.println("Entered mobile number must be 10 digits");
							}
							}
							
							System.out.println("Gender:");
							String newGender=sc.nextLine();
							if(newGender.equalsIgnoreCase("Male")||newGender.equalsIgnoreCase("Female")) {
							user.setGender(newGender);
							}
							else {
								System.out.println("Wrong gender entered");
							}
							
							System.out.println("Enter your new Mail Id");
							boolean emailTrue=true;
							while(emailTrue) {
							 newEmail=sc.nextLine();
							int newDot=newEmail.indexOf(".");
							if(newEmail.contains("@")&&newEmail.contains(".")&&newEmail.indexOf("com")>newDot && newEmail.indexOf(".")==newEmail.lastIndexOf(".")&& newEmail.equals(mail)) {
								System.out.println("Entered same old mail");
								user.setEmail(newEmail);
								emailTrue=false;
							}
							else if(newEmail.contains("@")&&newEmail.contains(".")&&newEmail.indexOf("com")>newDot && newEmail.indexOf(".")==newEmail.lastIndexOf(".")) {
								user.setEmail(newEmail);
								emailTrue=false;
							}
							else if(newEmail.contains("@")&&newEmail.contains(".")&&newEmail.indexOf("com")>newDot && newEmail.indexOf(".")!=newEmail.lastIndexOf(".")) {
								user.setEmail(newEmail);
								emailTrue=false;
							}
							else {
								System.out.println("Entered wrong email Id!!");
							}
							}
							
							
							UserData newUser=UserData.getInstance();
							newUser=hm.remove(mail);
							hm.put(newEmail,newUser);
							
							TravelDetails newTravelD=new TravelDetails();
							newTravelD=hd.remove(mail);
							hd.put(newEmail, newTravelD);
							
							CustBills newCustB=new CustBills();
							newCustB=hc.remove(mail);
							hc.put(newEmail, newCustB);
							System.out.println("Press any  key to save and exit!!");
//							sc.nextLine();
							
						
						case 6:
							FileOutputStream newfos=new FileOutputStream("C:\\Java\\ABC Customers.txt");
							ObjectOutputStream newoos=new ObjectOutputStream(newfos);
							
							newoos.writeInt(hm.size());
							
							for(UserData d:hm.values()) {
								newoos.writeObject(d);
							}
							//for Tours TravelDetails Class
							FileOutputStream fost=new FileOutputStream("C:\\Java\\ABC Tours.txt");
							ObjectOutputStream oost=new ObjectOutputStream(fost);
							//for Bill CustBill class
							FileOutputStream fob=new FileOutputStream("C:\\Java\\ABC Customer Bills.txt");
							ObjectOutputStream oob=new ObjectOutputStream(fob);
							//for Bill CustBill class
							oob.writeInt(hc.size());
							for(CustBills d:hc.values()) {
								oob.writeObject(d);
							}
							//for Tours TravelDetails Class
							oost.writeInt(hd.size());
							for(TravelDetails t:hd.values()) {
								oost.writeObject(t);
								
							}
							System.out.println("Booking closed You are logged Off");
							out=false;
							break;
							
							default: System.out.println("Wrong selection");
						}
						 
							
					}
				
				
					
				}
//				else if(user.getEmail()==null) {
//					System.out.println("No user found");
//					System.exit(0);
//				}
				
				else if(user.getPassword()!=password) {
					if(Count>0) {
					Count--;
					System.out.println("You have more "+Count+" Chance left!!");
					}
					else {
						System.out.println("Your account is blocked");
						user.setAccountStatus("Block");
						hm.put(mail, user);
				}
			}
				}
				catch(Exception e) {
					System.out.println("No user found");
				}
			break;
				
			
			case 3:
			case 4: 
				
				System.out.println("System exit ");
				exit=false;
//				System.exit(0);
				
				break;
			default:
				System.out.println("Oops!! you entered wrong selection");
					

			}				
	}
}
		
		catch (Exception e) {
			e.printStackTrace();
		}
//		finally {
//			System.out.println("It seems you did a mistake in booking!! :( ");
//			System.out.println("Login and try again");
//		}

	}

	

}
