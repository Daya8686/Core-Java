package CollectionsInJava;

import java.util.ArrayList;
import java.util.Collections;


public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1,"AAA",56);
		Student s2=new Student(8,"MM",59);
		Student s3=new Student(3,"C",53);
		
		ArrayList<Student> a=new ArrayList<>();
		a.add(s1);
		a.add(s2);
		a.add(s3);
		Collections.sort(a);
		System.out.println(a);
	}

}

// by using comparable we will compare the object with current object by implementing Comparable interface and by overriding comparTo method
//this.id will take student class its value and s.id will take value from the object of student
class Student implements Comparable<Student>{
	int id;
	String name;
	int marks;
	
	Student(int id,String name, int marks){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	
	
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", marks=" + marks + "]";
	}




	@Override
	public int compareTo(Student s) {
		// TODO Auto-generated method stub
//		if(this.id<s.id)
//			return -1;
//		else
//			return 1;
		// different types of sorting by different values
//		if(this.name.equals (s.name))
//			return 1;
//		else
//			return -1;
//		if(this.name.compareTo (s.name))
//			return 1;
//		else
//			return -1;
		if(this.marks<s.marks)
			return -1;
		else
			return 1;
	}
	
}
