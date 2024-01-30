package JavaAWT;

import java.awt.*;

public class FirstApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f=new Frame();
		f.setLayout(new FlowLayout());
		
		
		Label l=new Label("Name ");
		TextField tf=new TextField();
		Button b =new Button("OK");
		f.add(l);
		f.add(tf);
		f.add(b);
		
		f.setSize(800, 800);
		f.setVisible(true);
		

	}

}
