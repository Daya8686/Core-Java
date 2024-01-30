package CollectionsInJava;

public class StudentDemo {
	int id;
	int marks;
	String name;
	
	StudentDemo(int id,int marks,String name){
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	
	public String toString() {
		return "[ id: "+id+", name: "+name+", marks: "+marks+"]";
	}

}
