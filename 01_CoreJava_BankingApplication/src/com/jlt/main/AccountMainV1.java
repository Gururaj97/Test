package com.jlt.main;

import com.jlt.pojo.Account;

public class AccountMainV1 
{

	public static void main(String[] args) 
	{
		System.out.println("We are in Main");
		Account account;
		account= new Account();
		System.out.println(account);
		System.out.println(account.hashCode());
		
		System.out.println("-----------------------------");
		//Account account2= new Account(101,"Dhnashri Awati",1000);
		
		System.out.println(account);
		System.out.println(account.hashCode());
		
		System.out.println("-----------------------------");
		
		System.out.println(account);
		System.out.println(account.hashCode());
		System.out.println("-----------------------------");
		
		Account account22 = account;
		System.out.println(account22);
		System.out.println(account22.hashCode());
		System.out.println("-----------------------------");
		
		account22.setName("Test Name");
		System.out.println(account22);
		System.out.println(account22.hashCode());
		System.out.println("-----------------------------");
		
		System.out.println(account);
		System.out.println(account.hashCode());
		
		System.out.println("Main end!!");
		System.out.println("-----------------------------");
	
	}
	
}
