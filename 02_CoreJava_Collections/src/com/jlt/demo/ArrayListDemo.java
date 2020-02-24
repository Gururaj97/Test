package com.jlt.demo;


import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo 
{
	//private List<String> nameList= new ArrayList<String>();
	private  ArrayList<String> nameList= new ArrayList<String>();
	
	public void print()
	{
		System.out.println("size::"+ nameList.size());
		nameList.add("Dhanashri");
		nameList.add("Shivani");
		nameList.add("Shweta");
		nameList.add("Sneha");
		nameList.add("Rutuja");
		nameList.add("Dhanashri");
		nameList.add("Dhanashri");
		System.out.println("size::"+ nameList.size());
		System.out.println(nameList);
		nameList.remove("Rutuja");
		
		System.out.println("size::"+ nameList.size());
		System.out.println(nameList);
	}
	
}
