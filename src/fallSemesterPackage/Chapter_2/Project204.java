package fallSemesterPackage.Chapter_2;

import java.util.*;

public class Project204 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double year;
		double minutes;
		
		System.out.print("Type in year to calculate minutes per year:.. ");
		year = reader.nextDouble();
		
		if (year % 4 == 0) {
			minutes = 366.0 * 24.0 * 60.0; 
			System.out.println("This is a leap year...");
			System.out.println("Adjusting...");
		} else {
			minutes = 365.0 * 24.0 * 60.0;
		}
		
		System.out.print("The are " + minutes + " minutes in " + year + ".");
		
		reader.close();
	}

}
