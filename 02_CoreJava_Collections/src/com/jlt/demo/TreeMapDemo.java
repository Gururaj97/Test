package com.jlt.demo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo
{
	private Map<Integer,String> userMap= new TreeMap<Integer,String>();
	
	public void printMap()
	{
		userMap.put(102,"Jetha");
		userMap.put(100,"Daya");
		userMap.put(101,"babita");
		userMap.put(125,"Bhide");
		userMap.put(1000,"Ayyer");
		//userMap.put(null,"ttt");
		
		System.out.println(userMap);
	}
	
}
