package JavaLangPackages;

public class BoxingAndUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer a=new Integer(10); //---->This is boxing but we are not using this method
		Integer a=Integer.valueOf(10); //---->This is boxing
		System.out.println(a);
		Integer aa=10; //---->auto boxing
		Integer b=new Integer("11");
		System.out.println(b);
		//Integer c=new Integer("18.99"); //this will not work
		//System.out.println(c);y
		Byte c=new Byte("10");
		System.out.println(c);
//		Byte c=new Byte(10); //this will not work because it is convertion from int to byte
		byte x=12;
		//Byte d=new Byte(x);//---->This is boxing but not in use
		Byte d=Byte.valueOf(x);  //---->This is Boxing
		Byte e=12;//--->This is auto boxing
		
		Float f=Float.valueOf(10.32f); //---->This is Boxing
		Float g=10.23f; //--->This is auto boxing

		
//------------------------------------------------------------------------------------------------
									//UnBoxing & Auto UnBoxing 
		
		int v=a.intValue();  //---->Unboxing
		int y=a;  //---->Auto Unboxing
		byte o=d.byteValue(); //---->Unboxing
		byte q=d;  //---->Auto Unboxing
		
		
		
		
				

	}

}
