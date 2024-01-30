package JavaAWT;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;



class MyFrame04 extends Frame{
	TextArea ta;
	Choice c;
	List l;
	
	MyFrame04(){
		super("ListBox Demo");
		l=new List(4,true);
		c=new Choice();
		ta=new TextArea(20,30);
		
		setLayout(new FlowLayout());
		c.add("Monday");
		c.add("Tuesday");
		c.add("Wednesday");
		c.add("Thusday");
		c.add("Friday");
		c.add("Saturday");
		c.add("Sunday");
		
		l.add("January");
		l.add("February");
		l.add("March");
		l.add("April");
		l.add("May");
		l.add("June");
		l.add("July");
		
		act a=new act();
		
		setLayout(new FlowLayout());
		add(l);
		add(c);
		add(ta);
		l.addItemListener(a);
		c.addItemListener(a);
		l.addActionListener(a);
		
	}
	class act implements ItemListener, ActionListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) {
			if(e.getSource()==l) {
				ta.setText(l.getSelectedItem());
			}
			else
				ta.setText(c.getSelectedItem());
			
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String lists[]=l.getSelectedItems();
			String txt="";
			for(String x:lists)
				txt=txt+x+"\n";
			ta.setText(txt);
		}
		
		
	}
	
}


public class TextAreaDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame04 f=new MyFrame04();
		f.setSize(400,400);
		f.setVisible(true);

	}

}
