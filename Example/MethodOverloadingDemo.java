package Example;

public class MethodOverloadingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingDemo d=new MethodOverloadingDemo();
		d.showDetails("Raj");
		d.showDetails(5);

	}
	
	public void showDetails() {
		System.out.println("Show Details");
	}
	
//	public int showDetails() {
//		return 0; //this will not work as an overloading 
	//if return type changes and there is no parameter then we get error if we have parameter then no error
//	}
	
	public int showDetails(int a,int b) {
		return 0;
	}
	
	public void showDetails(String name) {
		System.out.println("Show Details "+name);
	}
	public void showDetails(int value) {
		for(int i=0; i<value;i++) {
		System.out.println("Show Details");
		}
	}
	
}
