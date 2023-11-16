package Generics;

public class GenericsInJava<T> {

	private T var;
	public void setMeth(T v) {
		var=v;
	}
	public T getMrth() {
		return var;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GenericsInJava<Integer> gen=new GenericsInJava<>();
		gen.var=1000;
		System.out.println(gen.getMrth());
		

	}

}
