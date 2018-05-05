package com.poc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;


public class MapExample {

	Map<Integer,List<String>> mm;
	
	public MapExample() {
		mm = new HashMap<Integer, List<String>>();
	}
	
	public void addElements() {
		
//		mm.put(2, "a");
//		mm.put(3, "c");
//		mm.put(3, "b");
//		mm.put(4, "c");
//		mm.put(2, "a");
//		mm.put(null,"v");
//		mm.put(2,null);
		
		List<String> ll = new ArrayList<String>();
		ll.add("abc");
		ll.add("cde");
		
		mm.put(1, ll);
	}
	
	public void displayElements() {
		
		System.out.println(mm);
		Set <Integer> keys =  mm.keySet();
		
		for(Integer kk: keys ) {
			System.out.println(mm.get(kk));
			List<String> values = mm.get(kk);
			for(String vv: values ) {
				System.out.println("key:" + kk + " " +"values:" + vv);
			}
		}
		
	}
}
