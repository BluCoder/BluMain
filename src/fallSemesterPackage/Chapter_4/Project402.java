package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project402 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double a;
		double b;
		double c;
		double swapSpace;
		
		System.out.println("Input the lengths of the legs:.. ");
		a = reader.nextDouble();
		b = reader.nextDouble();
		c = reader.nextDouble();
		
		if (a > c & b < a){
			swapSpace = a;
			a = c;
			c = swapSpace;
		} else {
			swapSpace = b;
			b = c;
			c = swapSpace;
		}
//		System.out.print(a + " " + b + " " + c);
		
		if ( c == Math.sqrt(a * a + b * b)){
			System.out.println("This is a right triangle.");
		} else {
			if ( c == a & c == b){
				System.out.println("This is an equilateral triangle.");
			} else {
				System.out.println("This is not a right triangle.");
			}
		}
		
		reader.close();
	}
}
