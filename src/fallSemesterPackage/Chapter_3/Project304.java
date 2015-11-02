package fallSemesterPackage.Chapter_3;

import java.util.*;

public class Project304 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =  new Scanner(System.in);
		double regularHours;
		double hourlyRate;
		double total, counter;
		double overtime;
		
		System.out.print("What is the regular hourly pay in dollars:.. $");
		hourlyRate = reader.nextDouble();
		
		regularHours = 25;
		while (regularHours > 24 | regularHours < 0){	
			System.out.print("How many hours are in the regular day:.. ");
			regularHours = reader.nextDouble();
			if (regularHours > 24 | regularHours < 0){
				System.out.print(regularHours + " is an invalid input. Please input a value between 0 and 24.");
			}
		}
		
		int i;
		counter = 0;
		for (i = 1; i < 6; i++) {
			overtime = 25;
			while (overtime > 24 - regularHours| overtime < 0){	
				System.out.print("How many hours of overtime are worked on day " + i + ":.. ");
				overtime = reader.nextDouble();
				if (overtime > 24 - regularHours| overtime < 0){
					System.out.print(overtime + " is an invalid input. Please input a value between 0 and " + (24-regularHours) + ".");
				}
			}
			total = counter + regularHours * hourlyRate + overtime * hourlyRate * 1.5;
			counter = total;
		}
//		System.out.print(counter);
		
		System.out.print("The total pay in the period is $" + counter + ".");
		
		reader.close();
	}

}