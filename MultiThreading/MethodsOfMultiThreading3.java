package MultiThreading;

class my extends Thread{
	public void run() {
//		while(true) {
		System.out.println("Hello");
//		}
	}
	public my(String name) {
		setName(name);
		setPriority(MAX_PRIORITY-2);
	}
}
public class MethodsOfMultiThreading3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		my t=new my("THIS THREAD");
		
		System.out.println(t.getId());
		System.out.println(t.getName());
		System.out.println(t.getPriority());
		t.start();
		System.out.println(t.isAlive());
		
	}

}
