/**
 * 
 */
package cmo.csi.fact;

/**
 * @author Admin
 *
 */
public class factorial {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fact=1, n = 6;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
			System.out.println("Factorial of " + n + " is :" + fact);
		}

	}

}
