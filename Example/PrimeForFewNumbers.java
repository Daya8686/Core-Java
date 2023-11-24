package Example;

public class PrimeForFewNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2;i<=100;) {
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println("prime "+i);
				
			}
			i++;
		}

	}

}
