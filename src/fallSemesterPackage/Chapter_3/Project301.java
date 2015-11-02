package fallSemesterPackage.Chapter_3;

import java.util.*;

public class Project301 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int sideLength;
		int surfaceArea;
		
		System.out.print("What is the integer side length:.. ");
		sideLength = reader.nextInt();
		
		surfaceArea = 6 * sideLength * sideLength;
		
		System.out.print("The surface area is " + surfaceArea + ".");
		
		reader.close();
	}

}
