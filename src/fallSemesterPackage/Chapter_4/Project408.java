package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project408 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double base, exponent;
		double output;
		int flooredexponent;
		int counter;
		
		System.out.println("Enter -1 to exit at anytime.");
		
		while (true){
			output = 1;
			
			System.out.print("What is the base:.. ");
			base = reader.nextDouble();
			
			if (base == -1 ) 
				break;
			
			System.out.print("What positive integer expontent is " + base + " to be raised to:.. ");
			exponent = reader.nextDouble();
			
			if (exponent == -1 ) 
				break;
			
			flooredexponent = (int) Math.floor(exponent);
			
			for (counter = 0; counter < flooredexponent; counter++){
				output = base * output;
			}
			
			System.out.println(base + "^" + exponent + " equals " + output + ".");
		}
		
		System.out.println("Done.");
		
		reader.close();
	}
}
