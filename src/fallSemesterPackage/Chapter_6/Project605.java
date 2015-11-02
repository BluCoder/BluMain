package fallSemesterPackage.Chapter_6;

import java.util.*;
import fallSemesterPackage.Utilities.IdiotChecker;

public class Project605 {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		IdiotChecker I = new IdiotChecker();
		int x = 858, y = 858, r;
		String p;
		
		while (!I.within(x, 585) || !I.within(x, 585)){
			System.out.print("Columns:.. ");
			x = reader.nextInt();
			
			System.out.print("Rows:.. ");
			y = reader.nextInt();	
			
			if (!I.within(x, 585) || !I.within(x, 585))
				System.out.println("The table can only handle up to 584 x 584. " + 
						"\nPlease insert valid dimensions.");
		}
			
		p = x * y + "";
		r = p.length();
		
		for (int i = 0; i <= y; i++){
			if (i == 0){
				for(int n = 0; n <= y; n++){
					if (n != 0){
						p = n + "";
						while (p.length() < r + 1){
							p += " ";
						}
						System.out.print(p);
					} else {
						p = "X";
						while (p.length() < r + 1){
							p += " ";
						}
						System.out.print(p);
					}
				}
				System.out.println();
			} else {
				for(int j = 0; j <= x; j++){
					if (j != 0){
						if (j != x){
							p = j * i + "";
							while (p.length() < r + 1){
								p += " ";
							}
							System.out.print(p);
						}
						else
							System.out.print(j * i + "\n");
					} else {
						p = i + "";
						while (p.length() < r + 1){
							p += " ";
						}
						System.out.print(p);
					}
				}
			}
		}
		
		reader.close();
		
	}
}
