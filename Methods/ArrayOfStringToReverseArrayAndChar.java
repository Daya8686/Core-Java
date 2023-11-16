package Methods;

public class ArrayOfStringToReverseArrayAndChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is a Programming Language";
		
		String starr[]=str.split("\\s");
		String demost[]=new String[starr.length];
		String demo="";
		for(int i=0;i<starr.length;i++) {
			String temp=starr[i];
			for(int j=0;j<temp.length();j++) {
			char c=temp.charAt(j);
			demo=c+demo;
			}
			
			demost[i]=demo;
			demo=" ";
			
		}
		String sstt="";
		for(int i=0;i<starr.length;i++) {
			
			sstt=demost[i]+sstt;
			
			//System.out.println(demost[i]);
		}
		System.out.println(sstt);

	}

}
