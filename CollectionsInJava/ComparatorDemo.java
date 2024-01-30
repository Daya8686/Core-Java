package CollectionsInJava;

import java.util.*;
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// we use comparator when we need to implement our own sorting for the class or collections
		//and we use Comaparator when we a we have any third party class or class in jar file and we need to sort the values from it
		StudentDemo s1=new StudentDemo(1,34,"raju");
		StudentDemo s2=new StudentDemo(2,12,"ravi");
		StudentDemo s3=new StudentDemo(3,89,"ramesh");
		StudentDemo s4=new StudentDemo(8,50,"rakesh");
		ArrayList<StudentDemo> a=new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		a.add(s4);
		MarksComarator mc=new MarksComarator();
		Collections.sort(a,mc);
		System.out.println(a);
		Collections.sort(a,new RollNoComparator());
		System.out.println(a);
		Collections.sort(a,new NameComparator());
		System.out.println(a);
		
		
		//By using lamda expression
		 Comparator<StudentDemo> c=(x,y)->x.id>y.id? 1:-1; //this future came from Java version 8
		 Collections.sort(a,c);
		 System.out.println("Lamda expression");
		System.out.println(a);
		 Comparator<StudentDemo> c1=(x,y)->x.name.compareTo(y.name);
		 Collections.sort(a,c1);
		 System.out.println(a);
		 
		 Collections.sort(a,(x,y)->x.marks>y.marks? 1:-1);
		 System.out.println(a);
	}

}

class MarksComarator implements Comparator<StudentDemo>{
	

	@Override
	public int compare(StudentDemo st1, StudentDemo st2) {
		// TODO Auto-generated method stub
		if(st1.marks>st2.marks) {
			return 1;
		}
		return -1;
	}
}
class RollNoComparator implements Comparator<StudentDemo>{

	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {
		// TODO Auto-generated method stub
		if(o1.id>o2.id) {
			return 1;
		}
		return -1;
	}
	
}

class NameComparator implements Comparator<StudentDemo>{

	@Override
	public int compare(StudentDemo o1, StudentDemo o2) {
		// TODO Auto-generated method stub
		
		return (o1.name.compareTo(o2.name));
	}
	
}