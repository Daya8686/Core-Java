package ClassesAndObjects;

public class SetGetWithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cylinderCalculation c=new cylinderCalculation();
		c.setRadious(5);
		c.setHeight(56);
		System.out.println("Get Radious:"+c.getRadious());
		System.out.println("get height:"+c.getHeight());
		System.out.println("area is:"+c.lidarea());
		System.out.println("volume is: "+c.volume());

	}

}
class cylinderCalculation{
	private double radious;
	private double height;
	
	public cylinderCalculation() {
		radious=height=1;
	}
	public cylinderCalculation(double r,double h){
		radious=r;
		height=h;
		}
	public void setRadious(double re) {
		if(re>0)
			radious=re;
		else 
			radious=0;
	}
	public void setHeight(double he) {
		if(he>0)
			height=he;
		else
			he=0;
	}
	public double getRadious() {
		return radious;
	}
	public double getHeight() {
		return height;
	}
	
	public double lidarea() {
		return Math.PI*radious*radious;
		}
	public double volume() {
		return lidarea()*height;
	}
	
	}

