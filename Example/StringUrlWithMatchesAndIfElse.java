package Example;

public class StringUrlWithMatchesAndIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="https://www.google.com";
		int semi=url.indexOf(":");
		int dot=url.lastIndexOf(".");
		String protocol=url.substring(0,semi);
//		System.out.println(protocol);
		String domain=url.substring(dot+1,url.length());
//		System.out.println(domain);
		if(protocol.equals("https")) {
			System.out.println("This is https protocol");
			
		}
		else if(protocol.equals("http")) {
			System.out.println("This is http protocol");
			
		}
		else if(protocol.equals("ftp")) {
			System.out.println("This is ftp protocol");
			
		}
		else {
			System.out.println("Its a invalid");
		}
		
		if(domain.equals("com")) {
			System.out.println("Its a com for domain");
		}
		else if (domain.equals("org")) {
			System.out.println("Its a org for domain");
		}
		else if (domain.equals("net")) {
			System.out.println("Its a net for domain");
			
		}
		else {
			System.out.println("Domain defers");
		}

	}

}
