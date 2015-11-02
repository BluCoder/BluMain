package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project405 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double sum = 0;
		int counter;
		int desiredIterations;
		
		System.out.println("How many iterations would you like in the algorithm:.. ");
		desiredIterations = reader.nextInt();

//		Functioning code using mods not powers
		for (counter = 0; counter < desiredIterations; counter++){
			double multiplier = counter;
			if (counter % 2 == 0) 
				sum += 1/(multiplier * 2 + 1);
			else 
				sum = sum - 1/(multiplier * 2 + 1);
//			System.out.println(sum);
		}

//		Functioning code using powers not mods
/*		for (counter = 0; counter < desiredIterations; counter++){
			double multiplier = counter;
			sum += Math.pow(-1, multiplier) * 1/(multiplier * 2 + 1);
//			System.out.println(sum);
		}
*/		
		sum = 4 * sum;
		System.out.println("The approximation of pi generated with " + desiredIterations + 
				" iterations equals " + sum + ".");
		
		reader.close();
	}
}
