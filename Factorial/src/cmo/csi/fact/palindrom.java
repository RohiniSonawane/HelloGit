/**
 * 
 */
package cmo.csi.fact;

/**
 * @author Admin
 *
 */
public class palindrom {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int sum=0, r;
		int temp=n;
		while(n>0)
		{
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(sum==temp)
		{
			System.out.println("palindrom number");
		}
		else
		{
			System.out.println("no is not Palindrom");
		}
	}

}
