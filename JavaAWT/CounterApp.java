package JavaAWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame extends Frame implements ActionListener
{
	int count=0;
	Label l;
	Button b;
	
	MyFrame(){
		super("Counter");
		l=new Label(""+count);
		b=new Button("Click");
		b.addActionListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(b);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count++;
		l.setText(""+count);
		
	}
	
	
}



public class CounterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame f=new MyFrame();
		f.setSize(500, 500);
		f.setVisible(true);

	}

}
