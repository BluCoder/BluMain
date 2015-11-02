package fallSemesterPackage.Chapter_7;

import java.util.*;
import fallSemesterPackage.Utilities.*;

public class Project704 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double input = 0, min = 1000, max = 0, sum = 0, average = 0;
		int counter = 0;
		
		System.out.println("Enter the scores. \nEnter a negative score to end... ");
		
		while (input >= 0){
			input = reader.nextDouble();
			
			if (input >= 0){
				sum += input;
				
				counter++;
				
				if (min > input)
					min = input;
				
				if (max < input)
					max = input;
			}
		}
		
		average = ((sum * 100) / counter) / 100;
		
		System.out.println("Class Average: " + SchoolTools.getLetterGrade((int) Math.floor(average)) + "\n" +
				           "Class Maximum: " + SchoolTools.getLetterGrade((int) Math.floor(max)) + "\n" +
						   "Class Minimum: " + SchoolTools.getLetterGrade((int) Math.floor(min)));
		
		reader.close();
		
	}
}
