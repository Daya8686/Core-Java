package ClassesAndObjects;

public class CoffeMechine {
	private float WaterQuantity;
	private float MilkQuantity;
	private float CoffeQuantity;
	private float SugerQuanity;
	
	static private CoffeMechine my=null;
	
	private CoffeMechine() {
		WaterQuantity=1;
		MilkQuantity=1;
		CoffeQuantity=1;
		SugerQuanity=1;
	}
//	static public CoffeMechine getFirst() {
//		my=new CoffeMechine();
//		return my;
//	}
	
	static public CoffeMechine getInstance() {
		if(my==null)
			my=new CoffeMechine();
		
		return my;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeMechine c=CoffeMechine.getInstance();
		CoffeMechine c1=CoffeMechine.getInstance();
		//CoffeMechine a1=CoffeMechine.getFirst();
		//In this it will refer to only one object that is c=c1=c2=c3.....
		CoffeMechine c2=CoffeMechine.getInstance();
		c2.CoffeQuantity=2;
		System.out.println(c2.CoffeQuantity);
		//System.out.println(c1.equals(a1));
		
	}

}
