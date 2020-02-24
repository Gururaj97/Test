package com.jlt.pojo;

public class Account
{
	private  int accountnumber;
	private static int accountnumbergenerator=10000;
	private String name;
	private double balance;
	
	public Account() 
	{
		System.out.println("Default constructor of Account");
	}

	public Account(int accountnumber, String name, double balance) {
		super();
		this.accountnumber = accountnumber;
		this.name = name;
		this.balance = balance;
		System.out.println(" 3 Parameterised constructor of Account");
	}
	public Account(String name, double balance) {
		super();
		accountnumbergenerator++;
		accountnumber=accountnumbergenerator;
		this.name = name;
		this.balance = balance;
		System.out.println("2 Parameterised constructor of Account");
	}
	public boolean withdraw(double amount)
	{
		if(amount> 0 &&amount<= balance)
		{
			balance-=amount;
			return true;
		}
		return false;
	}
	public boolean deposite(double amount)
	{
		if(amount>0)
		{
			balance+=amount;
			return true;
		}
		
		return false;
	}
	public int getAccountnumber() {
		return accountnumber;
	}

	public void setAccountnumber(int accountnumber) {
		this.accountnumber = accountnumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [Accountnumber=" +accountnumber +"Name=" +name +"Balance="+balance +"]";
	}
}
