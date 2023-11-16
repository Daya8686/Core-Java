package MultiThreading;
class whiteboard{
	String text;
	int numberOfStudents=0;
	int count=0;
	public void attendence() {
		numberOfStudents++;
	}
	synchronized public void write(String s) {
		System.out.println("Writting "+s);
		while(count!=0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		text=s;
		count=numberOfStudents;
		notifyAll();
	}
synchronized	public String read() {
	String t;
		while(count==0) {
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}t=text;
		count--;
		
		if(count==0)
				notify();
		return t;
		
		
	}
	
}

class teacher extends Thread{
	whiteboard w;
	String str[]= {"Java is a oop","Its a platform independent","This supports Thread","Write once read many times","end"};
	
	teacher(whiteboard w){
		this.w=w;
	}
	public void run() {
		for(int i=0;i<str.length;i++) {
			w.write(str[i]);
		}
	}
}
class student extends Thread{
	String name;
	whiteboard w;
	student(String name,whiteboard w){
		this.name=name;
		this.w=w;
	}
	public void run() {
		String text;
		w.attendence();
//		if(text.equals("end")) {
//			System.exit(0);
//		}
//		else {
//			System.out.println(name+" reading "+text);
//		}
		do {
			text=w.read();
			System.out.println(name+" reading "+text);
			System.out.flush();
			
		}
		while(!text.equals("end"));
	}
}
public class InterThreadCommunicationWithFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		whiteboard w=new whiteboard();
		teacher t=new teacher(w);
		
		student s=new student("1. Ravi", w);
		student s1=new student("2. vinay", w);
		student s2=new student("3. kumar", w);
		student s3=new student("4. Ashish", w);
		
		
		t.start();
		
		s.start();
		s1.start();
		s2.start();
		s3.start();
		

	}

}
