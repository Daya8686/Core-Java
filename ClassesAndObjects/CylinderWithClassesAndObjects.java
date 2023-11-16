package ClassesAndObjects;

public class CylinderWithClassesAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinder c=new cylinder();
		c.radious=7;
		c.height=10;
		System.out.printf("%2.2f \n",c.lidArea());
		System.out.println(c.volume());
		System.out.println(c.circumfrence());
		System.out.println(c.totalSurfaceArea());

	}
	

}

class cylinder{
	public double radious;
	public double height;
	
	public double lidArea() {
		return Math.PI*radious*radious;
	}
	
	
	public double volume() {
		//return (Math.PI*(radious*radious))*height;
		return lidArea()*height;
	}
	public double circumfrence() {
		return 2*Math.PI*radious;
	}
	public double totalSurfaceArea() {
		
		return 2*lidArea()+circumfrence()*height;
	}
}
