package Methods;

public class SumOfArrayWithVariableOfArguments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(sum(10,43,56,89));
		System.out.println(sum(0,1,3,2));
		System.out.println(sum());
		System.out.println(sum(0));

	}
	static int sum(int ...A) {
		if(A.length==0)
			return Integer.MIN_VALUE;
		int sum=0;
		for(int x:A) {
			sum=sum+x;
		}
		return sum;
	}

}
