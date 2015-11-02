package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project401 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double n = 0;
		double d = 0;
		double swapStorageSpace;
		double quotient;
		double wholeNumberQuotient;
		double remainder;
		
		while (n == 0 | d == 0){
			System.out.println("Input the numbers to be divided, hit enter after each one:.. ");
			n = reader.nextDouble();
			d = reader.nextDouble();
//			System.out.print(n + "/" + d);
			if (n == 0 | d == 0){
				System.out.println("Zero is not a valid input. Please input a non-zero real number.");
			}
		}
			
		if (n < d){
			swapStorageSpace = n;
			n = d;
			d = swapStorageSpace;
		}
		
		quotient = n / d;
		wholeNumberQuotient = quotient - (n % d) / d;
		remainder = n % d;
		
		System.out.println("The quotient of " + n + " over " + d + 
				" is " + wholeNumberQuotient + " and the remainder is " + remainder + ".");
		
		reader.close();
	}
}
