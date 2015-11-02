package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project406 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double initialPopulation, finalPopulation;
		double growth, timeForGrowth;
		double time;
		
		System.out.print("What is the initial population:.. ");
		initialPopulation = reader.nextDouble();
		
		System.out.print("What is the factor of growth in a period:.. ");
		growth = reader.nextDouble();
		
		System.out.print("How long is the period of growth, in hours:... ");
		timeForGrowth = reader.nextDouble();
		
		System.out.print("What is the total period of growth, in hours:.. ");
		time = reader.nextDouble();
		
		finalPopulation = initialPopulation + time * growth / timeForGrowth;
		
		System.out.println("The final population is " + finalPopulation + ".");
		
		reader.close();
	}
}
