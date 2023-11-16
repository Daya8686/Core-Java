package JavaIO;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

class producer extends Thread{
	OutputStream os;
	producer(OutputStream o){
		os=o;
	}
	public void run() {
		try {
	int count=1;
	while(true) {
		os.write(count++);
		os.flush();
		System.out.println("Producer"+count);
		Thread.sleep(10);
		
	}
		}
	catch(Exception e) {
		e.printStackTrace();
	}
		
	
	}
}




class consumer extends Thread{
	InputStream is;
	consumer(InputStream s){
		is=s;
	}
	public void run() {
		try {
		while(true) {
		System.out.println(	"Consumer"+is.read());
		Thread.sleep(10);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}

public class PipedInputAndOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PipedInputStream pis=new PipedInputStream();
		PipedOutputStream pos=new PipedOutputStream();
		try {
			pos.connect(pis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		producer p=new producer(pos);
		consumer c=new consumer(pis);
		
		p.start();
		c.start();

	}

}
