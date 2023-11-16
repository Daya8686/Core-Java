package JavaAnnotations;

import java.util.List;

//@Override Annotation
class my{
	public String name() {
		return "Name";
	}
	@Deprecated
	public void display() {
		
	}
}
class myNew extends my{
	@Override
	public String name() {
		return "name";
	}
	
}

public class AnnotationsInJava {

	public static void main(String[] args) {
		@SuppressWarnings("Unchecked")
		List l = null;
		// TODO Auto-generated method stub
		@SuppressWarnings("Deprecated")
			my m=new my();
			m.display();
			l.add(10);
	}

}
