/**
 * 
 */
package cmo.csi.fact;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class fact {
	

	/**
	 * @param args
	 */
	int factorial(int n)
	{
		if(n==0)
			{
			return 1;
			}
		else{
			
		
			return(n * factorial(n-1));
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int f=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no to be calculated");
		int n=sc.nextInt();
		System.out.println("Number :"+n);
		fact a=new fact();
		f=a.factorial(n);
		System.out.println("factorial : "+f);
		
        
	}

}
