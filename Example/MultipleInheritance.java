package Example;

interface xyz{
	default void show() {
		System.out.println("hello");
	}
	
}
interface uuu{
	default void show() {
	System.out.println("Hello2");
	}
}
interface abc{
	static void show() {
		
	}
}
class mnop{
	public static void print() {
		System.out.println("Hello");
	}
}
class ijk extends mnop{
	public void AMethod() {
		ijk n=new ijk();
		n.print();
	}
}
class bbb{
	public void Meths() {
		System.out.println("Hey");
	}
}
class aaa extends bbb{
	public static void Meth() {
		aaa a=new aaa();
		a.Meths();
	}
}
public class MultipleInheritance extends aaa implements xyz,abc{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultipleInheritance m=new MultipleInheritance();
		m.show();
//		m.AMethod();
		m.Meths();
		m.show();
		

	}

	//@Override
//	public void show() {
//		// TODO Auto-generated method stub
//		uuu.super.show();
//	}

}
