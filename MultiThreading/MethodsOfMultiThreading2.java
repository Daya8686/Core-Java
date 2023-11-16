package MultiThreading;

public class MethodsOfMultiThreading2 extends Thread{
	
public void run() {
	while(true) {
	System.out.println("Hello");
}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodsOfMultiThreading2 t=new MethodsOfMultiThreading2();
		t.start();
		while(true) {
			System.out.println("world");
		}

	}

}
