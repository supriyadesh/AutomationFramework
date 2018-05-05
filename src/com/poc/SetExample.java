package com.poc;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
	Set<String> ss;

	public SetExample() {
		ss = new LinkedHashSet<String>();
	}
	
	public void addElements() {
		
		ss.add("t");
		ss.add("t");
		ss.add("b");
		ss.add("a");
		ss.add("c");
	}
	
	public void displayElements() {
		System.out.println(ss);
//		int len = ss.size();
//		for (int i=0;i<len;i++)
//		{
//			System.out.println();
//		}
		for (String val : ss) {
			if(val == "t") {
				System.out.println(val);	
			}
			
		}
		
		Iterator<String> itr = ss.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
	
	
}
