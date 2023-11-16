package MultiThreading;

class mythread01 extends Thread{
	Mydisplay d;
	mythread01(Mydisplay data){
		d=data;
	}
	public void run() {
		d.display("New line of text");
	}
}
class mythread2 extends Thread{
	Mydisplay d;
	mythread2(Mydisplay data){
		d=data;
	}
	public void run() {
		d.display("Old line of text for example");
	}
}
class Mydisplay{
	public void display(String str) {
		for(int i=0;i<str.length();i++) {
			
			char c=str.charAt(i);
			System.out.print(c);
		}
	}
}

public class WithoutSyncroization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mydisplay d=new Mydisplay();
		mythread01 t=new mythread01(d);
		mythread2 t1=new mythread2(d);
		
		t.start();
		t1.start();

	}

}
