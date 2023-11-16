package TryCatchThrowThrowsException;

class NumberCanNotBeNegivtive extends Exception{
	public String toString() {
		return "Number can not be negitive while multipling";
	}
}




public class UserDefineException {

	public int meth1(int l,int b) throws NumberCanNotBeNegivtive
	{
		if(l<0||b<0) {
			throw new NumberCanNotBeNegivtive();
		}
		
		
		return l*b;
		
	}
	public void meth2() 
	{
		try {
		int res=meth1(10,-6);
		System.out.println(res);
		}
		catch(NumberCanNotBeNegivtive e) {
			System.out.println(e);
			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefineException u= new UserDefineException();
		u.meth2();

	}

}
