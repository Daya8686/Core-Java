package Methods;

public class VariableArgumentForFindingMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Max value" + max(10,20,50,38,96));
		System.out.println("Zero value" +max(0));
		System.out.println(max());
		

	}
	static int max(int ...A) {
		if(A.length==0)
			return Integer.MIN_VALUE;
		int max=A[0];
		for(int v:A) {
			System.out.println(v);
		}
		for(int i=0;i<A.length;i++) {
			if(max<A[i]) {
				max=A[i];
			}
		}
		return max;
	}

}
