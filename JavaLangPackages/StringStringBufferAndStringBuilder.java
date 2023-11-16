package JavaLangPackages;

public class StringStringBufferAndStringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1=new String("Hello");
//		StringBuffer s2=new StringBuffer("Hello");
//		StringBuilder s3=new StringBuilder("Hello");
//		s1.concat("World");  //this value will not change
//		s2.append(7657.32);
//		s3.append(0);
//		StringBuffer s4=new StringBuffer();
//		s4.append(false);
//		s4.insert(3, "text");
//		
//		
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s4);
		StringBuffer arr=new StringBuffer();
		StringBuilder arrr=new StringBuilder();
		String arre="This is a programming language";
		String demoarr[]=arre.split("\\s");
		for(int i=0;i<demoarr.length;i++) {
		 arr.append(demoarr[i]+" ");
		 arrr.append(demoarr[i]+" ");
		}
		System.err.println(arr);
		System.err.println(arrr);
		
		
		//System.out.println("Now performing reverse of a string with all characters");
		StringBuilder sb=new StringBuilder();
		arre="This is a new program for making string revers";
		System.out.println(arre);
		String rem;
		String res="";
		String rev[]=arre.split("\\s");
		for(int i=0;i<rev.length;i++) {
			rem=rev[i];
			for(int j=0;j<rem.length();j++) {
				char c=rem.charAt(j);
				res=c+res;
			}
			res=" "+res;
			//with append we get this output
//			sb.append(res);
//			res=" ";
			
			
		}
		System.out.println(res);
		System.out.println(sb);
		
		
		
		

	}

}