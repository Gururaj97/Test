package com.jlt.pojo;

public class Savings extends Account
{
	private boolean isSalary;
	public Savings() 
	{
	System.out.println(" Default Constructor of Savings");
	}
	public Savings(String name,double balance,boolean isSalary)
	{
		super(name,balance);
		this.isSalary=isSalary;
		System.out.println("Parameterized constructor of Savings");
	}
	@Override
	public boolean withdraw(double amount) 
	{
		if(isSalary)
		{
			if(amount>0 && amount<=getBalance())
			{
				setBalance(getBalance()-amount);
				return true;
			}
		}
		return false;
		
	}
	@Override
	public boolean deposite(double amount)
	{
		if(amount>0)
		{
			setBalance(getBalance()+amount);
			return true;
		}
		return false;
	}
	public boolean isSalary() {
		return isSalary;
	}
	@Override
	public String toString() {
		return "Savings [isSalary=" + isSalary + ", toString()=" + super.toString() + "]";
	}
	
}
