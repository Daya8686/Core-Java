package CollectionsInJava;

import java.util.*;

class Point implements Comparable{
	int x;
	int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	public int compareTo(Object o) {
		Point p=(Point)o;
		if(this.x<p.x)
			return -1;
		else if(this.x>p.x) 
			return 1;
		else {
				if(this.y<p.y)
					return -1;
				else if(this.y>p.y)
					return 1;
				else
					return 0;
			}
		
	}
	public String toString() {
		return "x:"+x+" y:"+y;
	}
	
}
public class JavaTreeSetComparable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Point> ts=new TreeSet<>();
		ts.add(new Point(1,1));
		ts.add(new Point(2,4));
		ts.add(new Point(2,1));
		ts.add(new Point(5,8));
		ts.add(new Point(2,0));
		System.out.println(ts);
		
		
			

	}

}
