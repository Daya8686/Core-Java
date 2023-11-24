package Example;

import MultiThreading.SleepWithInterruption;

public class PrimeFor100Numbers {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int count=0,i=1,j=1,n=1;
		while(n<=100) {
			j=1;
			count=0;
			while(j<=i) {
				if(i%j==0) {
					count++;
					
				}
				j++;
			}
			if(count==2) {
				System.out.println(i);
				n++;
				//Thread.sleep(10000);
			}
			i++;

		}

	}

}
