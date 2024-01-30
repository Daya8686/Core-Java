package JavaAWT;

import java.awt.*;
import java.awt.event.*;

class MyFrame1 extends Frame implements ItemListener
{
	Label l;
	Checkbox c1,c2,c3;
	
	public MyFrame1() {
		super("Check Box App Demo");
		l=new Label("Noting is selected     ");
		c1=new Checkbox("Java");
		c2=new Checkbox("Python");
		c3=new Checkbox("C#");
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);
		setLayout(new FlowLayout());
		add(l);
		add(c1);
		add(c2);
		add(c3);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		String s="";
		if(c1.getState())
			s=s+" "+c1.getLabel();
		if(c2.getState())
			s=s+" "+c2.getLabel();
		if(c3.getState())
			s=s+" "+c3.getLabel();
		if(s.isEmpty())
			s="Noting is selected";
		l.setText(s);
		
	}
}



public class CheckBoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame1 f=new MyFrame1();
		f.setSize(500,500);
		f.setVisible(true);
		
		
	}

}
