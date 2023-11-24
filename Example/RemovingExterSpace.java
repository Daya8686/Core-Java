package Example;

public class RemovingExterSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This   is  for a   Example";
		String str1=str.replaceAll("\\s+", " ");
		//str=str.replaceAll("   ", " ");
		System.out.println(str.replaceAll("\\s+", " "));
	}

}
