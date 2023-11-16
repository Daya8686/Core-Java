package MultiThreading;
class producer1 extends Thread{
	MyObj o;
	producer1(MyObj o){
		this.o=o;
		
	}
	public void run() {
		int i=1;
	while(true) {
		o.setmethod(i);
		System.out.println("producer"+i);
		i++;
	}
	}
}
class consumer1 extends Thread{
	MyObj o;
	consumer1(MyObj o){
		this.o=o;
	}
	public void run() {
		while(true) {
		System.out.println("consumer"+o.getmethod());
		}
	}
}
class MyObj{
	private int v=0;
	boolean flag=true;
synchronized	public void setmethod(int a) {
		while(flag!=true) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		v=a;
		flag=false;
		notify();
		
	}
synchronized	public int getmethod() {
		int x;
		while(flag!=false) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		x=v;
		flag=true;
		notify();
		return x;
	}
}
public class InterThreadCommunication1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int count=0;
		MyObj o=new MyObj();
		
		producer1 p=new producer1(o);
		consumer1 c=new consumer1(o);
//		consumer1 c1=new consumer1(o);
//		consumer1 c2=new consumer1(o);
//		if(count==0) {
//		p.start();
//		count++;
//		}
//		else {
//		c.start();
//		count++;
//		c1.start();
//		count++;
//		c2.start();
//		count=0;
//		}
		p.start();
		c.start();

	}

}
