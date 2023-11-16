package MultiThreading;

class myThread extends Thread{
	public void run() {
		while(true) {
		System.out.println("Hello");
		}
	}
}
public class MethodsOfMultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread t=new myThread();
		t.start();
		while(true) {
		System.out.println("world");
		}

	}

}
