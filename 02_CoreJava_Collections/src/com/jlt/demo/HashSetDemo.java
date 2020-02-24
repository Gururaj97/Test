package com.jlt.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo 
{
	private Set<Integer> nameSet= new HashSet<Integer>();
	
	public void printSet()
	{
		nameSet.add(103);
		nameSet.add(100);
		nameSet.add(105);
		nameSet.add(101);
		nameSet.add(102);
		nameSet.add(104);
		
		System.out.println(nameSet);
		 System.out.println("HashCode value: "
                 + nameSet.hashCode()); 
	}
}
