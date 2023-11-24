package NetworkProgramming;

import java.io.*;
import java.net.*;

public class ClientAndServerNetworkProgram extends Thread{ //Server
	
	Socket sk;
	public ClientAndServerNetworkProgram(Socket sk) {
		// TODO Auto-generated constructor stub
		this.sk=sk;
	}
	public void run() {
		try {
		BufferedReader brs=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream ps=new PrintStream(sk.getOutputStream());
		StringBuilder b;
		String msg;
		
		do {
			msg=brs.readLine();
			b=new StringBuilder(msg);
			b.reverse();
			ps.println(b);
		}
		while(!b.equals("dne"));
		sk.close();
		}
		catch(Exception e) {}
	}
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ServerSocket ss=new ServerSocket(2000);
		Socket sc;
		int count=1;
		ClientAndServerNetworkProgram c;
		
		//StringBuffer sb=new StringBuffer();
//		PrintStream ps=new PrintStream(sc.getOutputStream());
		do {
		sc=ss.accept();
		c=new ClientAndServerNetworkProgram(sc);
		System.out.println("Client count "+count++);
		c.start();
		
		}
		while(true);
		

	}
}




class Client{
	public static void main(String[] args) throws Exception
	{
		Socket st=new Socket("10.237.4.227",2000); //creating a Socket with IP and port near local host we can enter the IP address
		BufferedReader keyb=new BufferedReader(new InputStreamReader(System.in)); //taking input from keyboard
		PrintStream ps=new PrintStream(st.getOutputStream()); //to send the keyboard entered value
		BufferedReader br=new BufferedReader(new InputStreamReader(st.getInputStream()));//to take input from the server
		String ms;
		do {
			ms=keyb.readLine();
			ps.println(ms);
			ms=br.readLine();
			System.out.println("From Server "+ms);
		}
		while(!ms.equals("dne"));
		
	}
}


