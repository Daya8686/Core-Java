package MultiThreading;

class MyMethod extends Thread{
	public void run() {
		int count=1;
//		while(true) {
//			
//			System.out.println(count++);
//			try {
//				Thread.sleep(100);
//				
//				}
//				catch(InterruptedException e) {
//					System.out.println("Thread is interrupted");
//				}
//	}
		}
	
	MyMethod(String name){
		super(name);
	}
}



public class MethodsOfMultiThreading4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMethod m=new MyMethod("THIS IS THREAD");
		m.start();
		System.out.println(m.getName());
		

	}

}
