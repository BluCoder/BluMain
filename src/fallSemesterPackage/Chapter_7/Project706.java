package fallSemesterPackage.Chapter_7;

import java.util.*;

public class Project706 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random gen = new Random();
		Scanner reader = new Scanner(System.in);
		int counter = 1, money, die1, die2;
		double rolls = 0, average;
		
		System.out.println("How much money to wager:.. ");
		money = (int) Math.ceil(reader.nextDouble());
		final int MONEY = money;
		
		for (counter = 0; counter <= 100; counter++){
			money = MONEY;
			while (money > 0){	
				die1 = gen.nextInt(6) + 1;
				die2 = gen.nextInt(6) + 1;
				
				rolls++;
				
				if (die1 + die2 == 7)
					money += 4;
				else
					money--;
			}
		}
		
		average = (int) Math.floor((rolls / 100) * 100);
		
		System.out.println("On average, with $" + MONEY + ", you will go broke after " + average + " rolls.");
		
		reader.close();
		
	}
}
