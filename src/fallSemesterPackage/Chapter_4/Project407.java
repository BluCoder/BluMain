package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project407 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double input;
		double output;
		int flooredInput;
		int counter;
		
		System.out.println("Enter -1 to exit at anytime.");
		
		while (true){
			output = 1;
			
			System.out.print("What positive integer expontent is two to be raised to:.. ");
			input = reader.nextDouble();
			
			if (input == -1) 
				break;
			
			flooredInput = (int) Math.floor(input);
			
			for (counter = 0; counter < flooredInput; counter++){
				output = 2.0 * output;
			}
			
			System.out.println("2.0^" + input + " equals " + output + ".");
		}
		
		System.out.println("Done.");
		
		reader.close();
	}
}
