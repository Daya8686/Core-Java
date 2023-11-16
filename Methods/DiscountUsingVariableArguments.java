package Methods;

public class DiscountUsingVariableArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(discount(23,445,56,767,23));
		System.out.println(discount(23,6,8,56,54,4,34,6,89,567,76,455));

	}
	static double discount(double ...D) {
		int discount=0;
		if(D.length==0)
			return Integer.MIN_VALUE;
		double sum=0;
		double amount;
		int discountcut;
		for(double x:D)
		{
			sum=sum+x;
		}
		if(sum<500) {
			discount=5;
			
		}
		else if(sum>500&&sum<1000) {
			discount=10;
			
		}
		else if(sum>1000&&sum<2500) {
			discount=25;
		}
		else if(sum>2500&sum<Integer.MAX_VALUE) {
			discount=50;
		}
		else 
			discount=0;
		
		discountcut=100-discount;
		
		amount=(sum*discount)/100;
		sum=sum-amount;
		return sum;
		
	}
	

}
