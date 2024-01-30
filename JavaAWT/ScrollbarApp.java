package JavaAWT;

import java.awt.*;
import java.awt.event.*;

class Myframe05 extends Frame implements AdjustmentListener{
	
	Scrollbar red,blue,green;
	TextField tf;
//	TextArea ta;
	
	 Myframe05() {
		// TODO Auto-generated constructor stub
		super("Scroll Bar App");
		red=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		blue=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		green=new Scrollbar(Scrollbar.HORIZONTAL, 0, 20, 0, 255);
		
		tf=new TextField(20);
//		ta=new TextArea(20,10);
//		ta.setBounds(20,50,200,100);
		tf.setBounds(20,100,500,100);
		red.setBounds(50,250,300,30);
		blue.setBounds(50,300,300,30);
		green.setBounds(50,350,300,30);
		setLayout(null);
		add(tf);
		add(red);
		add(blue);
		add(green);
//		add(ta);
		red.addAdjustmentListener(this);
		blue.addAdjustmentListener(this);
		green.addAdjustmentListener(this);
		
		
		
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		tf.setBackground(new Color(red.getValue(), blue.getValue(), green.getValue()));
		
		
	}
	
	
}



public class ScrollbarApp {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Myframe05 f =new Myframe05();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
