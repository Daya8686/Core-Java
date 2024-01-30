package Example;

public class UniqueChar2 {

	static final int TOTAL_CHAR_SIZE=256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueChar2.Process("GeeksforGeeks");

	}
	public static void Process(String str) {
		char c[]=new char[TOTAL_CHAR_SIZE];
		int n=str.length();
		for(int i=0;i<n;i++) {
			if(str.charAt(i)!=' ') {
			c[(int)str.charAt(i)]++;
			}
		}
		for(int i=0;i<n;i++) {
			if((c[(int )str.charAt(i)])==1) {
				System.out.print(str.charAt(i));
			}
		}
		
	}

}
