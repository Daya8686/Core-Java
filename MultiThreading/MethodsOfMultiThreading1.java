package MultiThreading;

class MyThread1 implements Runnable{
	public void run() {
		while(true) {
			System.out.println("Hello");
		}
	}
}

public class MethodsOfMultiThreading1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MyThread1 t=new MyThread1();
		Thread th=new Thread(t);
		th.start();
		while(true) {
			System.out.println("world");
		}
		

	}

}
