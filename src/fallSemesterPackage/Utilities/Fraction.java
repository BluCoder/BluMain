package fallSemesterPackage.Utilities;

public class Fraction {
	
	private int num;
	private int denom;
	
	public Fraction(){
		num = 0;
		denom = 0;
	}
	
	public void newFraction(int n, int d){
		num = n;
		denom = d;
	}
	
	public void newFraction(Fraction f){
		num = f.getNum();
		denom = f.getDenom();
	}
	
	public int getNum(){
		return num;
	}
	
	public int getDenom(){
		return denom;
	}
	
	public String addFrac(Fraction f){
		int newNum = num * f.getDenom() + f.getNum() * denom;
		int newDenom = denom * f.getDenom();
		
		String result = newNum + "/" + newDenom;
		
		return result;
	}
	
	public String subtractFrac(Fraction f){
		int newNum = num * f.getDenom() - f.getNum() *  denom;
		int newDenom = denom * f.getDenom();
		
		String result = newNum + "/" + newDenom;
		
		return result;
	}
	
	public String multFrac(Fraction f){
		int newNum = num * f.getNum();
		int newDenom = denom * f.getDenom();
		
		String result = newNum + "/" + newDenom;
		
		return result;
	}
	
	public String divFrac(Fraction f){
		int newNum = (num) * (f.getDenom());
		int newDenom = denom * f.getNum();
		
		String result = newNum + "/" + newDenom;
		
		return result;
	}
	
	public String toString(){
		String string = num + "/" + denom;
		return string;
	}
}
