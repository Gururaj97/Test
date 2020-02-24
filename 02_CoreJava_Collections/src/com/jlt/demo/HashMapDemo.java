package com.jlt.demo;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo 
{
	private Map<Integer,String> userMap= new HashMap<Integer,String>();
	
	public void printMap()
	{
		userMap.put(1011,"Seeta");
		userMap.put(1021,"Seeta");
		userMap.put(1031,"Meeta");
		userMap.put(1041,"Neeta");
		userMap.put(null,null);
		userMap.put(0,null);
		
		System.out.println(userMap);
	}
}
