package com.jlt.demo;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo2 
{
	private Set<String> nameSet= new HashSet<String>();
	
	public void printSet()
	{
		nameSet.add("Dhanashri");
		nameSet.add("Janhavi");
		nameSet.add("Shivani");
		nameSet.add("Shweta");
		nameSet.add("Dhanashri");
		nameSet.add("Rutuja");
		nameSet.add("Sneha");
		nameSet.add("Shivani");
		
		System.out.println(nameSet);
		 System.out.println("HashCode value: "
                 + nameSet.hashCode()); 
		 
		 for(String name:nameSet)
		 {
			 System.out.println("value::"+name+ "Hashcode::" +name.hashCode());
		 }
	}
}

