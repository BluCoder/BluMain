package fallSemesterPackage.Chapter_6;

import fallSemesterPackage.Utilities.*;

public class Project603 {
	
	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fraction c = new Fraction();
		Fraction d = new Fraction();
		Fraction e = new Fraction();
		Fraction f = new Fraction();
		
		c.newFraction(2, 1);
		d.newFraction(2, 4);		
		e.newFraction(6, 9);
		f.newFraction(1, 3);

		System.out.println(c.toString());
		System.out.println(f.toString());
		System.out.println(c.multFrac(d));
		System.out.println(e.multFrac(d));
		System.out.println(e.divFrac(c));
		System.out.println(c.multFrac(d));
		System.out.println(e.divFrac(f));
	}

}
