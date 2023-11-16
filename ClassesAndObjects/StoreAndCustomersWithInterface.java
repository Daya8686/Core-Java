package ClassesAndObjects;

public class StoreAndCustomersWithInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		store s=new store();
		customer c1=new customer("john");
		customer c2=new customer("smith");
//		c1.callback();
//		c2.callback();
		s.register(c1);
		s.register(c2);
		s.invite();

	}

}

interface member {
	public void callback();
}

class customer implements member{
	String name;
	public customer(String s) {
		name=s;
	}
	public void callback() {
		System.out.println("Invited the customer "+name);
	}
}

class store{
	member m[]=new member[100];
	int count=0;
	
	void register(member ma) {
		m[count++]=ma;
		
	}
	void invite() {
		for(int i=0;i<count;i++) {
			m[i].callback();
		}
	}
}
