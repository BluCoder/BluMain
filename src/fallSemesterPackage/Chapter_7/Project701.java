package fallSemesterPackage.Chapter_7;

import java.util.*;
import fallSemesterPackage.Utilities.*;

public class Project701 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		Random generator = new Random();
		IdiotChecker I = new IdiotChecker();
		int input = -1, tries = 0, oldT = -1, n;
		
		n = generator.nextInt(101);
		
		while (input != n){
			
			while (!I.withinI(input, 100) || oldT != tries){
				System.out.print("Your guess:.. ");
				input = (int) Math.floor(reader.nextDouble());
				if (!I.withinI(input, 100))
					System.out.println("That is an invalid input. \nPlease input a value from 0 to 100.");
				else
					oldT++;
			}
			tries++;
			
			if (input == n){
				System.out.println("Correct! \nYou found the answer in " + tries + " tries.");	
			} else if (input < n){
				System.out.println("Too low.");
			} else {
				System.out.println("Too high.");
			}
		}
		
		reader.close();
				
	}

}
