package com.poc;

import java.util.ArrayList;
import java.util.List;

public class ListExample {

//	List ll = new List(); cannot create object
	List<String> ll;

	public ListExample() {
		ll = new ArrayList<String>();
	}

	public void addElements() {
		ll.add("z");
		ll.add("t");
		ll.add("t");
		ll.add("b");
	}

	public void removeElements() {
		
	}

	public void displayElements() {
		System.out.println(ll);
		int len = ll.size();
		for (int i=len-1; i>0; i-- ) {
			System.out.println(ll.get(i));
		}
		
	}
}

