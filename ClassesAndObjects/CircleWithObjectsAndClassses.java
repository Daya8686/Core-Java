package ClassesAndObjects;

public class CircleWithObjectsAndClassses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c=new circle();
		c.radious=7;
		System.out.println( c.area());
		System.out.println(c.perimeter());
		
		

	}	
}

class circle{
	public double radious;
	public double area() {
		return Math.PI*radious*radious;
	}
	public double perimeter() {
		return 2*Math.PI*radious;
	}
}