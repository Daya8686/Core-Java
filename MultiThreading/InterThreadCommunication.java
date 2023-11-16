package MultiThreading;
class producer extends Thread{
	MyDataObj d;
	producer(MyDataObj d){
		this.d=d;
	}
	public void run() {
		int i=1;
		while(true) {
			d.setmethod(i);
			System.out.println("Producer "+i);
			i++;
		}
		
	}
	
}

class consumer extends Thread{
	MyDataObj d;
	public consumer(MyDataObj d) {
		this.d=d;
	}
	public void run() {
		while(true) {
			System.out.println("consumer "+d.getmethod());
		}
	}
}

class MyDataObj{
	int value=0;
	boolean flag=true;
	synchronized void setmethod(int x) {
		while(flag!=true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		value=x;
		flag=false;
		notify();
		
	}
	synchronized int getmethod() {
		int x=0;
		while(flag!=false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		x=value;
		flag=true;
		notify();
		return x;
	}
}
public class InterThreadCommunication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyDataObj d=new MyDataObj();
		producer p=new producer(d);
		consumer c=new consumer(d);
		
		p.start();
		c.start();
		

	}

}
