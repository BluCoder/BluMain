package fallSemesterPackage.Chapter_2;

import java.util.*;

public class Project203 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double nauticalMiles;
		double kilometers;
		
		System.out.print("Enter number of kilometers:.. ");
		kilometers = reader.nextDouble();
		
		nauticalMiles = (0.0001) * (90.0) * (60.0) * kilometers;
		
		System.out.print("The equivalent in nautical miles is ");
		System.out.println(nauticalMiles);
		
		reader.close();
	}

}
