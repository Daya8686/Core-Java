package JavaAnnotations;



@interface MyAnnotation{
	String name() default "Daya"; //This is not called as method this is call as Elements
	String version();
	
}
@MyAnnotation( version="16")
public class UserDefineInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
