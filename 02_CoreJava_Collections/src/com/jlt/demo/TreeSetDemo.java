package com.jlt.demo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo
{
	private Set<String> nameSet= new TreeSet<String>();
	public void display()
	{
		nameSet.add("Z");
		nameSet.add("d");
		nameSet.add("a");
		nameSet.add("s");
		nameSet.add("m");
		nameSet.add("k");
		System.out.println(nameSet);
		
	}
	
}
