package com.jlt.pojo;

public class Current extends Account {

	private double overdraftBalance=50000, mainBalance=10000;
	private double bal=0;

	public Current() {
		System.out.println("Default Constructor Of Current");
	}

	public Current(String name, double balance, double overdraftBalance) {
		super(name, balance);
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public boolean withdraw(double amount) 
	{
		
		if(amount> 0 && amount<60000)
		{
			bal=amount-mainBalance;
			if(bal >0)
			{
				overdraftBalance=overdraftBalance-bal;
				setBalance(getBalance()+overdraftBalance-amount);
				return true;
			}
			
		}
		return false;
	}

	@Override
	public boolean deposite(double amount)
	{
		if(amount> 0)
		{
				setBalance(getBalance()+amount);
				overdraftBalance=overdraftBalance+amount-bal;
				return true;
			}
			
		return false;
	}

	public double getOverdraftBalance() {
		return overdraftBalance;
	}

	public void setOverdraftBalance(double overdraftBalance) {
		this.overdraftBalance = overdraftBalance;
	}

	@Override
	public String toString() {
		return "Current [overdraftBalance=" + overdraftBalance + ", toString()=" + super.toString() + "]";
	}

}

