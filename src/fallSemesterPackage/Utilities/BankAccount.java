package fallSemesterPackage.Utilities;

public class BankAccount {
	
	private String name;
	private double balanceRaw;
	private double balance;
	
	public void BankAccouont(String nm, double bal){
		name = nm;
		balance = (Math.floor(bal * 100)) / 100;
		balanceRaw = bal;
	}
	
	public void deposit(double deposit){
		balanceRaw += deposit;
		balance = Math.floor(balanceRaw * 100);
		balance = balance / 100;
	}
	
	public String getName(){
		return name;
	}
	
	public double getBal(){
		return balance;
	}
	
	public double getBalRaw(){
		return balanceRaw;
	}
	
	public void setName(String s){
		name = s;
	}
	
	public void setBal(double bal){
		balance = bal;
	}
	
	public String toString(){
		String string = "Customer " + name + "'s balance is $" + balance + ".";
		return string;
	}
}
