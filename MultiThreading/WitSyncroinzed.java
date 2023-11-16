package MultiThreading;
class Thread1 extends Thread{
	DisplayMeth m;
	Thread1(DisplayMeth m){
		this.m=m;
	}
	
	public void run() {
		m.display("This is a string from thread 1");
	
	}
}
class Thread2 extends Thread{
	DisplayMeth m;
	Thread2(DisplayMeth m){
		this.m=m;
	}
	public void run() {
		m.display("This is a string from thread 2");
	}
}
class DisplayMeth {
	synchronized void display(String s){ //with out using this the output will be the combination of two lines
	//synchronized (this) { //this also we can use 
		
		for(int i=0;i<s.length();i++) {
			
		System.out.print(s.charAt(i));
		}
		System.out.println();
	//}
	}
}
public class WitSyncroinzed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisplayMeth d=new DisplayMeth();
		Thread1 one= new Thread1(d);
		Thread2 two=new Thread2(d);
		
		one.start();
		two.start();
	}

}
