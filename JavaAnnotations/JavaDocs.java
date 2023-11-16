/**
 * @author Daya sagar
 * @version 2.87
 * @Since 2023
 */

package JavaAnnotations;

/**
 * 
 * @author Dayasagar
 *
 */
public class JavaDocs {

	/**	
	 *   {@value} these value is 10
	 */
	public static int val=10;
	/**
	 * @constructor This is a non parameter constructor
	 */
	
	public JavaDocs() {
		
	}
	/**
	 * 
	 * @param name this is a name of the parameter in constructor
	 */
	public JavaDocs(String name) {
		
	}
	/**
	 * 
	 * @param args
	 * @mainmethod this is a main method
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * This is DocMethod returns xyz
	 * @return
	 */
	public String DocMethod() {
		return "xyz";
	}
	/**
	 *@method This a void method returns nothing
	 */
	public void VoidMethod(){
		/**
		 * @method this will return true this is boolean method
		 */
	}
	public boolean ReturnMethod() {
		return true;
	}

}
