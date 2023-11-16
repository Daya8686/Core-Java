package ClassesAndObjects;

public class RectangleWithClassAndObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		rectangle r=new rectangle();
		r.length=23;
		r.breadth=34;
		System.out.println(r.area());
		System.out.println(r.parameter());
		System.out.println(r.isSquare());

	}

}
class rectangle{
	public double length;
	public double breadth;
	public double area() {
		return length*breadth;
	}
	public double parameter() {
		return 2*(length*breadth);
	}
	public boolean isSquare() {
		if(length==breadth) {
			return true;
		}
		else
			return false;
	}
}