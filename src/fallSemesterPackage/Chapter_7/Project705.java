package fallSemesterPackage.Chapter_7;

import java.util.*;

public class Project705 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int a, b, r = 1, store = 0;
		
		System.out.print("Enter two integers:.. \nInteger A: ");
		a = (int) Math.floor(reader.nextDouble());
		final int A = a;
		
		System.out.print("Integer B: ");
		b = (int) Math.floor(reader.nextDouble());
		final int B = b;
		
		if ( b > a){
			store = a;
			a = b;
			b = store;
		}
		
		while (b != 0){
			System.out.println(a + " / " + b + " = " + a / b + " R " + a % b);
			
			r = a % b;
			a = b;
			b = r;
		}
		
		System.out.println("The GCD of "+ A +" and " + B + " is " + a + ".");
		
		reader.close();
		
	}
}
