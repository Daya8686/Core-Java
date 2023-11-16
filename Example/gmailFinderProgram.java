package Example;

public class gmailFinderProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Programmer@gmail.com";
		int ind=str.indexOf("@");
		String username=str.substring(0,ind);
		String domain=str.substring(ind+1,str.length());
		System.out.println(username);
//		System.out.println(domain);
		int inddot=domain.indexOf(".");
		String befdot=domain.substring(0,inddot);
		String aftdot=domain.substring(inddot+1,domain.length());
		System.out.println(befdot);
		if(befdot.contains("gmail")) {
			System.out.println("gmail is there");
		}
		else {
			System.out.println("email does not conatains gmail");
		}
		if(aftdot.contains("com")) {
			System.out.println("com is there");
		}
		else
			System.out.println("no 'com' found");

	}

}
