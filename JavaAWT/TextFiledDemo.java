package JavaAWT;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;

import javax.swing.plaf.LabelUI;



class MyFrame03 extends Frame {
	Label l1,l2,l3,l4,l5;
	TextField tf1,tf2;
	
	public MyFrame03() {
		// TODO Auto-generated constructor stub
		l1=new Label(" No text is entered yet");
		l2=new Label("Enter is not yet hit");
		tf1=new TextField(20);
		l3=new Label("Enter User Name");
		l4=new Label("          Enter Password           ");
		tf2=new TextField(20);
		tf2.setEchoChar('*');
		l5=new Label();
		
		handler h=new handler();
		tf1.addTextListener(h);
		tf1.addActionListener(h);
		tf2.addTextListener(h);
		setLayout(new FlowLayout());
		
		add(l3);
		add(tf1);
		add(l1);
		add(l5);
		add(new Label("Password"));
		add(tf2);
		add(l4);
		add(l2); 
		
		
	}
	class handler implements TextListener,ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			l2.setText(tf1.getText());
			
			
		}

		@Override
		public void textValueChanged(TextEvent e) {
			// TODO Auto-generated method stub
			l1.setText(tf1.getText());
			l4.setText(tf2.getText());
			
		}
		
	}
}




public class TextFiledDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame03 f=new MyFrame03();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
