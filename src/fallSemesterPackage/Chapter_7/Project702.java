package fallSemesterPackage.Chapter_7;

import java.util.*;

public class Project702 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int upperB = 0, lowerB = 100, guess = 0, tries = 0;
		String input = " ";
		
		System.out.println("Pick a number from 1 to 100. \nThe computer will guess numbers. \nRespond with \"Too high\", \"Too low\", or \"Correct\".");
		
		while (!((input.equalsIgnoreCase("Correct")))){
			if ( tries != 0){
				if (input.equalsIgnoreCase("too high"))
					lowerB = guess;
				else if(input.equalsIgnoreCase("too low"))
					upperB = guess;
			}
			guess = lowerB + (int) Math.floor((upperB - lowerB) / 2);
		
			tries++;
			
			System.out.println("Is the number " + guess + "?");
			input = reader.nextLine();
			input.trim();
		
		}
		if (tries == 1)
			System.out.println("The computer guessed the number in " + tries + " try.");
		else
			System.out.println("The computer guessed the number in " + tries + " tries.");
		
		reader.close();
		
		
	}
}
