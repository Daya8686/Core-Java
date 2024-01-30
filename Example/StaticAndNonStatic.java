package Example;

public class StaticAndNonStatic {
	int a=10;
	static int c=98;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			 int b=11;
//			 a++;//we can not access variable defined in instance variable
//			 static int x=98; //we can not use static for variable in static method
			 StaticAndNonStatic.name();
			 StaticAndNonStatic s=new StaticAndNonStatic();
			 s.name1();
			 
			
	}
	public static void name() {
		String name="Orange";
		System.out.println(name);
//		static int num=98; // we can not declare static varibale inside a method
//		a++; //we can not access non static variable inside static method;
		c++; //we can access static variable inside static and non static methods 
		System.out.println(c);
		StaticAndNonStatic sc=new StaticAndNonStatic();
		sc.name1(); //by creating object only we can call non static varable and method
	}
	public void name1() {
//		static int number=877; //we can not declare a static variable in side a non static method
		c+=5;
		System.out.println(c);//we can access static variable inside static and non static methods
//		StaticAndNonStatic.name();
//		name(); //we can call a static method directly or by class name but can not do the same for non static we need to create a object for that
	}

}
