package ClassesAndObjects;

public class DataHidingMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinders c=new cylinders();
		c.setRadious(5.5);
		c.setHeight(6.7);
		System.out.println(c.area());

	}

}
class cylinders{
	private double radious;
	private double height;
	
	public double getRadious() {
		return radious;
	}
	public double getHeight() {
		return height;
	}
	public void setRadious(double r) {
		radious=r;
	}
	public void setHeight(double h) {
		height=h;
	}
	
	public double area() {
		return (Math.PI*radious*radious)*height;
	}
}
