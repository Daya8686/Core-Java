package MultiThreading;

class myM extends Thread{
	public void run() {
		int count=1;
		while(true) {
			System.out.println(count);
			try {
			Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				System.out.println(e);
			}
		}
	}
}
public class SleepWithInterruption {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			myM m=new myM();
			m.start();
			m.interrupt();
	}

}
