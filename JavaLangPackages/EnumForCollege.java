package JavaLangPackages;

enum Dept{
	CSE,IT,MECH,ECE,CIVIL;
	Dept(){
		System.out.println(name()); //this will print all the names because when an object is created then it will call all the object of enum
		
	}
}


public class EnumForCollege {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dept d = Dept.CIVIL;
		System.out.println(d);
		System.out.println(d.valueOf("CSE")); //this will print the value if it exist same in enum
		

	}

}
