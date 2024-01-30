package JavaAWT;
import java.awt.*;
import java.awt.event.*;

class MyFrame2 extends Frame implements ItemListener
{
	Label l;
	Checkbox c1,c2,c3;
	CheckboxGroup cg;
	
	public MyFrame2() {
		super("Radio Box App Demo");
		cg=new CheckboxGroup();
		l=new Label("        Select             ");
		c1=new Checkbox("Java",false,cg);
		c2=new Checkbox("Python", false,cg);
		c3=new Checkbox("C#",false,cg);
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
		// TODO Auto-generated method stub
		String s="";
		if(c1.getState())
			s=c1.getLabel();
		if(c2.getState())
			s=c2.getLabel();
		if(c3.getState())
			s=c3.getLabel();
		if(s.isEmpty())
			s="Nothing is selected";
		l.setText(s);
	}
}



public class RadioBoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame2 f=new MyFrame2();
		f.setSize(500,500);
		f.setVisible(true);

	}

}
