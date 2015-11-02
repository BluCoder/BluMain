package fallSemesterPackage.Utilities;

public class IdiotChecker {
	
	private double uBound;
	private double lBound;

	public boolean within(double n, double upperBound){
		return within(0, n, upperBound);
	}
	
	public boolean withinI(double n, double upperBound){
		return withinI(0, n, upperBound);
		
	}
	
	public boolean within(double lowerBound, double n, double upperBound){
		lBound = lowerBound;
		uBound = upperBound;
		if (lBound < n && n < uBound)
			return true;
		else 
			return false;
	}
	
	public boolean withinI(double lowerBound, double n, double upperBound){
		lBound = lowerBound;
		uBound = upperBound;
		if (lBound <= n && n <= uBound)
			return true;
		else 
			return false;
	}
	
	public boolean isNeg(double n){
		if (n < 0)
			return true;
		else
			return false;
	}
	
	public boolean isPos(double n){
		if (n > 0)
			return true;
		else
			return false;
	}
	
	public boolean validHour(double hours){
		IdiotChecker i = new IdiotChecker();
		
		if (i.withinI(0, hours, 24))
			return true;
		else
			return false;
	}
	
}
