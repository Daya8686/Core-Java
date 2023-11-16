package Example;

public class prime1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(2);
		int flag=1;
		for(int i=3;i<=100;i++) {
			flag=1;
			for(int j=2;j<=i/2;j++) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) {
				System.out.println(i);
				
			}
		}

	}

}
