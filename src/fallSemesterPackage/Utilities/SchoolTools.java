package fallSemesterPackage.Utilities;

import fallSemesterPackage.Utilities.IdiotChecker;

public class SchoolTools {
	
	public static String getLetterGrade(int grade){
		IdiotChecker I = new IdiotChecker();
		String output = "";
		int input = grade, tens;
		double remainder;
		
		if (input >= 0){
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
			}
		} else
			output = "Invalid input.";
	
		return output;
	}	
}
