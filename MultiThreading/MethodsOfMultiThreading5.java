package MultiThreading;

public class MethodsOfMultiThreading5 extends Thread{
		public void run() {
			int i=1;

		while(true) {
			System.out.println(i++ +"hello");
		}
	}
		public MethodsOfMultiThreading5(){
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		MethodsOfMultiThreading5 m=new MethodsOfMultiThreading5();
		int i=1;
//		m.setDaemon(true);
		m.start();
		Thread t= Thread.currentThread();
//		t.join();
		while(true) {
			System.out.println(i++ +"world");
			Thread.yield();
//			t.yield();
		//	m.interrupt();
		}
		

	}

}
