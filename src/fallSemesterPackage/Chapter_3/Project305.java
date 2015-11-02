package fallSemesterPackage.Chapter_3;

import java.util.*;

public class Project305 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader =  new Scanner(System.in);
		double weeks;
		double days;
		double dailyHours;
		double overtime;
		double hourlyRate;
		double total = 0;
		double avgDaily, avgWeekly;
		
		System.out.print("How many full weeks are in the pay period:.. ");
		weeks = reader.nextDouble();
		days = weeks * 7.0;
	
		System.out.print("How many remaining days are there in the pay period:.. ");
		days += reader.nextDouble();
//		System.out.print(days);
		
		System.out.print("What is the hourly pay in dollars:.. ");
		hourlyRate = reader.nextDouble();
		
		int i;
		for (i = 1; i < days + 1; i++) {
			dailyHours = 25;
			while (dailyHours > 24 | dailyHours < 0){	
				System.out.print("How many hours were worked on day " + i + ":.. ");
				dailyHours = reader.nextDouble();
				if (dailyHours > 24 | dailyHours < 0){
					System.out.println(dailyHours + " is an invalid input. Please input a value between 0 and 24.");
				}
			}
			overtime = 25;
			while (overtime > 24 - dailyHours| overtime < 0){	
				System.out.print("How many hours of overtime are worked on day " + i + ":.. ");
				overtime = reader.nextDouble();
				if (overtime > 24 - dailyHours| overtime < 0){
					System.out.print(dailyHours + " is an invalid input. Please input a value between 0 and " + (24 - dailyHours) + ".");
				}
			}
			total += dailyHours * hourlyRate + overtime * hourlyRate * 1.5;
		}
//		System.out.print(counter);
		
		avgDaily = total / days;
		avgWeekly = total / (days / 7 + weeks);

		System.out.println("The total amount of days in the period is " + days + ".");		
		System.out.println("The total pay in the period is $" + total + ".");
		System.out.println("The average daily pay in the period is $" + avgDaily + ".");
		System.out.println("The average weekly pay in the period is $" + avgWeekly + ".");
		
		reader.close();
	}
}
