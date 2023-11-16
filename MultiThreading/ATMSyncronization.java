package MultiThreading;
 class ATM{
	
	synchronized void checkBalance(String name) {
		System.out.println(name+" wants to check balance");
		try{Thread.sleep(1000);}catch(InterruptedException e) {e.printStackTrace();}
	}
	synchronized void withdrawAmount(String name, int amount ) {
		System.out.println(name+" wants to withdraw the amount: "+amount);
		try{Thread.sleep(1000);}catch(InterruptedException e) {e.printStackTrace();}
	}
	
}
class customer extends Thread{
	ATM a;
	private String name;
	private int amount;
	public customer(String name, int amount,ATM a) {
		this.name=name;
		this.amount=amount;
		this.a=a;
	}
	public void userATM() {
		a.checkBalance(name);
		a.withdrawAmount(name, amount);
	}
	public void run() {
		userATM();
		
	}
}
public class ATMSyncronization {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ATM a=new ATM();
		customer c=new customer("Rahul", 1000, a);
		customer c2=new customer("Vinay", 5000, a);
		c.start();
		c2.start();

	}

}
