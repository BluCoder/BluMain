package fallSemesterPackage.Chapter_3;

import java.util.*;

public class Project302 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double pi;
		pi = 3.1415926;
		double radius;
		double surfaceArea;
		double volume;
		double diameter;
		double greatCircle;
		
		System.out.print("What is the radius of the great circle:.. ");
		radius = reader.nextDouble();
		
		diameter = radius * 2.0;
		greatCircle = pi * radius * radius;
		surfaceArea = 4.0 * pi * radius * radius;
		volume = 4.0 / 3.0 * pi * radius * radius * radius;
		
		System.out.println("The diameter is " + diameter + ".");
		System.out.println("The circumfrence of the great circle is " + greatCircle + ".");
		System.out.println("The surface area of the sphere is " + surfaceArea + ".");
		System.out.println("The volume of the sphere is " + volume + ".");
		
		reader.close();
	}

}
