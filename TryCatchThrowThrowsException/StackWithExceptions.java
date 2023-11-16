package TryCatchThrowThrowsException;

//import java.util.Stack;

class StackOverFlowException extends Exception
{
	public String toString() {
		//System.out.println("Stack is full now you can not insert into it now");
		return "Stack is full now you can not insert into it now";
	}
	
}
class StackUnderFlowException extends Exception{
	public String toString() { //to get tghe same message we need to use toString and need to have return type as string 
		//System.out.println();
		return "Stack is Empty now you can not Delete from it now";
	}
}

class Stack{
	private int Size;
	private int top=-1;
	private int as[];
	
	public Stack(int s) {
		Size=s;
		as=new int[Size];
		
	}
	public void push(int a) throws StackOverFlowException {
		if(top==Size-1) {
			 throw new StackOverFlowException();
		}
		top++;
		as[top]=a;
		
	}
	public void pop(int a) throws StackUnderFlowException{
		if(top==-1) {
			throw new StackUnderFlowException();
		}
		int x=as[top];
				top--;
				System.out.println(x);
		//return x;
	}
}


public class StackWithExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		Stack s=new Stack(5);
		s.push(10);
		s.push(5);
//		s.push(2);
//		s.push(11);
//		s.push(50);
//		s.push(9);
		s.pop(10);
		s.pop(5);
		s.pop(3);
		
		}
		
		catch(StackOverFlowException e) {
			System.out.println(e);
		}
		catch(StackUnderFlowException e) {
			System.out.println(e);
		}

	}

}
