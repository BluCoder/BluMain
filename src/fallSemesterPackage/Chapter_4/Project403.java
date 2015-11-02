package fallSemesterPackage.Chapter_4;

import java.util.*;

public class Project403 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		double time = 0, timeRounded;
		final double costPerMinute = .5;
		final double costBase = 1.15;
		double finalCost;
		
		while (time <= 0){
			System.out.print("How long, in minutes, is the call:.. ");
			time = reader.nextDouble();
			if (time <= 0){
				System.out.println("That is not a valid input.");
			}
		}
		
		timeRounded = Math.floor(time);
		
		if (timeRounded < 2){
			finalCost = costBase;
		} else {
			finalCost = (timeRounded - 2) * costPerMinute + costBase;
		}
		
		System.out.print("The cost of the call of length " + time + " minutes equals $" + finalCost + ".");
		
		reader.close();
	}
}
