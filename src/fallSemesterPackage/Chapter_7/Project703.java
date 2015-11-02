package fallSemesterPackage.Chapter_7;

import java.util.*;
import fallSemesterPackage.Utilities.*;

public class Project703 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		IdiotChecker I = new IdiotChecker();
		String output;
		double input = 0, remainder;
		int tens;
		
		System.out.println("Enter a negative score at any time to quit.");
		
		while (input >= 0){
			output = "";
			System.out.println("What was the student's score:.. ");
			input = reader.nextDouble();
			
			if (input >= 0){
				tens = (int)Math.floor(input / 10);
				remainder = input - 10 * tens;
				
				if (tens >= 9){
					output += "A";
				} else {
					if (tens == 8){
						output += "B";
					} else {
						if (tens == 7){
							output += "C";
						} else {
							if (tens == 6){
								output += "D";
							} else 
								output += "F";
						}
					}
				}
				
				if (!output.equals("F") && input < 100){
					if (I.withinI(6, remainder, 9)){
						output += "+";
					} else {
						if (I.withinI(0, remainder, 2)){
							output += "-";
						}
					}
				} else {
					if (input > 100){
						output += "+";
					}
				}
				
				System.out.println(output);
			}	
		}
		
		System.out.println("Done. ");
		
		reader.close();
		
	}
}
